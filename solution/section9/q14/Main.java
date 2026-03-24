package section9.q14;

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
    static int[][] map;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int answer = 0;
    static int n;
    static Deque<Point> q = new ArrayDeque<>();
    
    // 7
    // 1 1 0 0 0 1 0
    // 0 1 1 0 1 1 0
    // 0 1 0 0 0 0 0
    // 0 0 0 1 0 1 1
    // 1 1 0 1 1 0 0
    // 1 0 0 0 1 0 0
    // 1 0 1 0 1 0 0
    public void bfs() {
        while(!q.isEmpty()) {
            Point p = q.poll();

            map[p.x][p.y] = 0;

            for (int i=0; i<8; i++) {
                int nx = p.x+dx[i];
                int ny = p.y+dy[i];

                if (nx >=0 && nx < n && ny >=0 && ny < n && map[nx][ny] == 1) {
                    map[nx][ny] = 0;
                    q.offer(new Point(nx, ny));
                }
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
                    q.offer(new Point(x, y));
                    answer++;
                    m.bfs();
                }
            }
        }

        System.out.println(answer);
    }
}