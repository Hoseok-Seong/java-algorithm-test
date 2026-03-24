package section9.q12;

import java.io.*;
import java.util.*;

class Point {
    public int x;
    public int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int m, n;
    static int[][] map, dis;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<Point> q = new ArrayDeque<>();

    // 6 4
    // 0 0 -1 0 0 0
    // 0 0 1 0 -1 0
    // 0 0 -1 0 0 0
    // 0 0 0 0 -1 1
    public void bfs() {
        while(!q.isEmpty()) {
            Point p = q.poll();
            map[p.x][p.y] = 1;

            for (int i=0; i<4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];

                if (nx > 0 && nx <= n && ny > 0 && ny <= m && map[nx][ny] == 0) {
                    map[nx][ny] = 1;
                    q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[p.x][p.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Main main = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        map = new int[n+1][m+1];
        dis = new int[n+1][m+1];

        for (int x=1; x<=n; x++) {
            st = new StringTokenizer(br.readLine());
            for (int y=1; y<=m; y++) {
                map[x][y] = Integer.parseInt(st.nextToken());

                if (map[x][y] == 1) {
                    q.offer(new Point(x, y));
                }
            }
        }

        main.bfs();

        // 모든 토마토 익어있으면 0, 토마토 익지 못하면 -1, 아닐 시 최소날짜
        int max = Integer.MIN_VALUE;
        
        for (int x=1; x<=n; x++) {
            for (int y=1; y<=m; y++) {
                if (map[x][y] == 0) {
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, dis[x][y]);
            }
        }

        System.out.println(max);
    }
}