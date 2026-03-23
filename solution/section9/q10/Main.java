package section9.q10;

import java.io.*;
import java.util.*;

// public class Main {
//     static int[][] map; // 방문체크
//     static int answer = 0;
    
//     public void dfs(int x, int y) {
//         if (x < 0 || y < 0 || x > 6 || y > 6) return;

//         if (map[x][y] == 1) return;

//         if (x == 6 && y == 6) {
//             answer++;
//             return;
//         } else {
//             map[x][y] = 1;
//             dfs(x, y+1); // 우
//             dfs(x, y-1); // 좌
//             dfs(x+1, y); // 하
//             dfs(x-1, y); // 상
//             map[x][y] = 0; // 백트래킹
//         }
//     }

//     // 0 0 0 0 0 0 0
//     // 0 1 1 1 1 1 0
//     // 0 0 0 1 0 0 0
//     // 1 1 0 1 0 1 1
//     // 1 1 0 0 0 0 1
//     // 1 1 0 1 1 0 0
//     // 1 0 0 0 0 0 0
//     public static void main(String[] args) throws Exception {
//         Main m = new Main();

//         map = new int[7][7];

//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         StringTokenizer st;

//         for (int x=0; x<7; x++) {
//             st = new StringTokenizer(br.readLine());

//             for (int y=0; y<7; y++) {
//                 map[x][y] = Integer.parseInt(st.nextToken());
//             }
//         }
        
//         m.dfs(0, 0);

//         System.out.println(answer);
//     }
// }

public class Main {
    static int[][] map; // 방문체크
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int answer = 0;
    
    public void dfs(int x, int y) {
        if (x == 7 && y == 7) {
            answer++;
            return;
        } else {
            for (int i=0; i<4; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];

                if (nx >=1 && nx <=7 && ny >=1 && ny <=7 && map[nx][ny] ==0) {
                    map[nx][ny] = 1;
                    dfs(nx, ny);
                    map[nx][ny] = 0;
                }
            }
        }
    }

    // 0 0 0 0 0 0 0
    // 0 1 1 1 1 1 0
    // 0 0 0 1 0 0 0
    // 1 1 0 1 0 1 1
    // 1 1 0 0 0 0 1
    // 1 1 0 1 1 0 0
    // 1 0 0 0 0 0 0
    public static void main(String[] args) throws Exception {
        Main m = new Main();

        map = new int[8][8];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        for (int x=1; x<8; x++) {
            st = new StringTokenizer(br.readLine());

            for (int y=1; y<8; y++) {
                map[x][y] = Integer.parseInt(st.nextToken());
            }
        }
        
        map[1][1] = 1;
        m.dfs(1, 1);
        
        System.out.println(answer);
    }
}