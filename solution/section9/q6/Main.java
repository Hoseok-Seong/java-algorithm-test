package section9.q6;

import java.io.*;
import java.util.*;

// 3 2
// 3 6 9
public class Main {
    static int x;
    static int y;
    static int[] arr;
    static int[] check;
    static int[] pm; // 순열

    public void dfs(int level) {
        if (level == y) {
            for (int i : pm) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        else {
            for (int i=0; i<x; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    pm[level] = arr[i];
                    dfs(level+1);
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        x = Integer.parseInt(st.nextToken());

        y = Integer.parseInt(st.nextToken());

        arr = new int[x];

        st = new StringTokenizer(br.readLine());

        for (int i=0; i<x; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        check = new int[x];
        pm = new int[y];

        m.dfs(0);
    }
}