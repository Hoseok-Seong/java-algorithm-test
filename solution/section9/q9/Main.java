package section9.q9;

import java.io.*;
import java.util.*;

// 조합은 그냥 외워버리자
public class Main {
    static int n; // 4
    static int f; // 2
    static int[] combi;

    public void dfs(int level, int num) {
        if (level == f) {
            for (int x : combi) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i=num; i<=n; i++) {
                combi[level] = i;
                
                dfs(level+1, i+1);
            }
        }
    }

    // 4 2
    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());
        
        combi = new int[f];
        
        m.dfs(0, 1);
    }
}

// // 조합은 그냥 외워버리자
// public class Main {
//     static int n; // 4
//     static int f; // 2
//     static int[] check;
//     static int[] combi;

//     public void dfs(int level, int num) {
//         if (level == f) {
//             for (int x : combi) {
//                 System.out.print(x + " ");
//             }
//             System.out.println();
//         } else {
//             for (int i=num; i<=n; i++) {
//                 if (check[i] == 0) {
//                     check[i] = 1;
//                     combi[level] = i;
                    
//                     dfs(level+1, i+1);
//                     check[i] = 0;
//                 }
//             }
//         }
//     }

//     // 4 2
//     public static void main(String[] args) throws Exception {
//         Main m = new Main();

//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         StringTokenizer st = new StringTokenizer(br.readLine());

//         n = Integer.parseInt(st.nextToken());
//         f = Integer.parseInt(st.nextToken());

//         check = new int[n+1];
//         combi = new int[f];
        
//         m.dfs(0, 1);
//     }
// }