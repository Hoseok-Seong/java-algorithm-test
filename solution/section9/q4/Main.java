package section9.q4;

import java.io.*;
import java.util.*;

public class Main {
    static int x;
    static int y;
    static int[] arr;

    public void dfs(int level) {
        if (level == y) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        else {
            for (int i=1; i<=x; i++) {
                arr[level] = i;
                dfs(level+1);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1부터 x까지
        x = Integer.parseInt(st.nextToken());

        // y번 뽑는다
        y = Integer.parseInt(st.nextToken());

        arr = new int[y];

        m.dfs(0);
    }
}