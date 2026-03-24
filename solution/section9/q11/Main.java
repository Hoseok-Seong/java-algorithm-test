package section9.q11;

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
    static int[][] map, dis;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public void bfs(int x, int y) {
        Queue<Point> q = new ArrayDeque<>();

        q.offer(new Point(x, y));
        map[x][y] = 1;

        while(!q.isEmpty()) {
            Point p = q.poll();

            for (int i=0; i<4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];

                if (nx > 0 && nx <= 7 && ny > 0 && ny <= 7 && map[nx][ny] == 0) {
                    map[nx][ny] = 1;
                    q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[p.x][p.y] + 1;
                }
            }
        }
    }

    // 0 0 0 0 0 0 0
    // 0 1 1 1 1 1 0
    // 0 0 0 1 0 0 0
    // 1 1 0 1 0 1 1
    // 1 1 0 1 0 0 0
    // 1 0 0 0 1 0 0
    // 1 0 1 0 0 0 0
    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        map = new int[8][8];
        dis = new int[8][8];

        for (int x=1; x<=7; x++) {
            st = new StringTokenizer(br.readLine());
            for (int y=1; y<=7; y++) {
                map[x][y] = Integer.parseInt(st.nextToken());
            }
        }

        m.bfs(1, 1);

        if (dis[7][7] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(dis[7][7]);
        }
    }
}
