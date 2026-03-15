package section9.q7;

import java.io.*;
import java.util.*;

// 기본 방식
// public class Main {
//     public int dfs(int n, int r) {
//         if (n==r || r==0) return 1;
//         else {
//             return dfs(n-1, r-1) + dfs(n-1, r);
//         }
//     }

//     public static void main(String[] args) throws Exception {
//         Main m = new Main();

//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         StringTokenizer st = new StringTokenizer(br.readLine());

//         int x = Integer.parseInt(st.nextToken());

//         int y = Integer.parseInt(st.nextToken());

//         System.out.println(m.dfs(x, y));
//     }
// }

// 메모이제이션
public class Main {
    int[][] arr = new int[35][35];

    public int dfs(int n, int r) {
        if (arr[n][r] > 0) {
            return arr[n][r];
        }

        if (n==r || r==0) return 1;
        else {
            return arr[n][r] = dfs(n-1, r-1) + dfs(n-1, r);
        }
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());

        int y = Integer.parseInt(st.nextToken());

        System.out.println(m.dfs(x, y));
    }
}