package section8.q8;

import java.io.*;
import java.util.*;

public class Main {
    int[] moves = new int[] {1, -1, 5};
    int[] check;
    int level;

    public int bfs(int cur, int arrival) {
        check = new int[10001];

        level = 0;

        Deque<Integer> q = new ArrayDeque<>();

        q.offer(cur);
        check[cur] = 1;

        while(!q.isEmpty()) {
            int len = q.size();
            for (int i=0; i<len; i++) {
                int n = q.poll();
                int nx;
                for (int j=0; j<3; j++) {
                    nx = n + moves[j];

                    if (nx == arrival) {
                        return level+1;
                    }

                    if (nx>=1 && nx <= 10000 && check[nx] == 0) {
                        q.offer(nx);
                        check[nx] = 1;
                    }
                }
            }
            level++;
        }

        return 0;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int cur = Integer.parseInt(st.nextToken());
        int arrival = Integer.parseInt(st.nextToken());

        System.out.println(m.bfs(cur, arrival));
    }
}
