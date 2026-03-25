package section9.q15;

import java.io.*;
import java.util.*;

// 조합은 외워놓기
public class Main {
    static int[][] map, dis;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int answer = 0;
    static int n, m;
    
    // 4 4
    // 0 1 2 0
    // 1 0 2 1
    // 0 2 1 2
    // 2 0 1 2
    public void dfs(int x, int y) {
        map[x][y] = 0;

        for (int i=0; i<4; i++) {
            int nx = x+dx[i];
            int ny = y+dy[i];

            if (nx >=0 && nx < n && ny >=0 && ny < n && map[nx][ny] == 0) {
                map[nx][ny] = 0;
                dfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Main main = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        m = Integer.parseInt(st.nextToken());

        map = new int[n][n];
        dis = new int[n][n];

        for (int x=0; x<n; x++) {
            st = new StringTokenizer(br.readLine());

            for (int y=0; y<n; y++) {
                map[x][y] = Integer.parseInt(st.nextToken());
            }
        }

        for (int x=0; x<n; x++) {
            for (int y=0; y<n; y++) {
                if (map[x][y] == 1) {
                    main.dfs(x, y);
                }
            }
        }
        
        System.out.println(answer);
    }
}
