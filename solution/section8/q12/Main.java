package section8.q12;

import java.io.*;
import java.util.*;

// 5 9
// 1 2
// 1 3
// 1 4
// 2 1
// 2 3
// 2 5
// 3 4
// 4 2
// 4 5
// 1에서 5로 가는 총 가지 수 출력
// 백 트래킹
public class Main {
    static int answer = 0;
    static int node;
    static int edge;
    static int[][] graph;
    static int[] check;

    public void dfs(int v) {
        if (v == node) {
            answer++;
        } else {
            for (int i=1; i<node+1; i++) {
                if (graph[v][i] == 1 && check[i] == 0) {
                    check[i] = 1;
                    dfs(i);
                    check[i] = 0;
                }
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        node = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(st.nextToken());

        graph = new int[node+1][node+1];
        check = new int[node+1];

        for (int i=0; i<edge; i++) {
            st = new StringTokenizer(br.readLine());
            int to = Integer.parseInt(st.nextToken());
            int from = Integer.parseInt(st.nextToken());
            graph[to][from] = 1;
        }

        // for (int i=1; i<node+1; i++) {
        //     for (int j=1; j<node+1; j++) {
        //         System.out.println(graph[i][j]);
        //     }
        // }

        check[1] = 1;
        m.dfs(1);
        System.out.println(answer);
    }
}
