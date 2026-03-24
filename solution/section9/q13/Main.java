package section9.q13;

import java.io.*;
import java.util.*;

public class Main {
    static int[][] map;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int answer = 0;
    static int n;
    
    // 7
    // 1 1 0 0 0 1 0
    // 0 1 1 0 1 1 0
    // 0 1 0 0 0 0 0
    // 0 0 0 1 0 1 1
    // 1 1 0 1 1 0 0
    // 1 0 0 0 1 0 0
    // 1 0 1 0 1 0 0
    public void dfs(int x, int y) {
        map[x][y] = 0;

        for (int i=0; i<8; i++) {
            int nx = x+dx[i];
            int ny = y+dy[i];

            if (nx >=0 && nx < n && ny >=0 && ny < n && map[nx][ny] == 1) {
                map[nx][ny] = 0;
                dfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        map = new int[n][n];

        for (int x=0; x<n; x++) {
            st = new StringTokenizer(br.readLine());

            for (int y=0; y<n; y++) {
                map[x][y] = Integer.parseInt(st.nextToken());
            }
        }

        for (int x=0; x<n; x++) {
            for (int y=0; y<n; y++) {
                if (map[x][y] == 1) {
                    m.dfs(x, y);
                    answer++;
                }
            }
        }
        
        System.out.println(answer);
    }
}