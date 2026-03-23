package section9.q8;

import java.io.*;
import java.util.*;

public class Main {
    static int[] combi; // 자리별 조합 가중치 배열
    static int[] numbers; // 완성할 순열 배열
    static int[] check;
    static int sum;
    static int n;
    static int f;
    boolean flag = false;

    int[][] dy = new int[35][35];

    public int combi(int n, int r) {
        if(dy[n][r] > 0) {
            return dy[n][r];
        }

        if (n==r || r==0) {
            return 1;
        } else {
            return dy[n][r] = combi(n-1, r-1) + combi(n-1, r);
        }
    }
    
    public void dfs(int l, int sum) {
        if(flag) {
            return;
        }

        if (l == n) {
            if (sum == f) {
                for (int x : numbers) {
                    System.out.print(x + " ");
                }
                flag = true;
            }
        } else {
            for (int i=1; i<=n; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    numbers[l] = i;

                    dfs(l+1, sum + (combi[l] * numbers[l]));
                    check[i] = 0;
                }
            }
        }
    }

    // 4 16
    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());

        combi = new int[n];
        numbers = new int[n];
        check = new int[n+1];

        for (int i=0; i<n; i++) {
            combi[i] = m.combi(n-1, i);
        }

        m.dfs(0, 0);
    }
}
