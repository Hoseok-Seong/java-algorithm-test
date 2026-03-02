package section8.q14;

import java.io.*;
import java.util.*;

// 6 9
// 1 3
// 1 4
// 2 1
// 2 5
// 3 4
// 4 5
// 4 6
// 6 2
// 6 5
// 1에서 출발하여 각 노드 별 최단거리
public class Main {
    static int answer = 0;
    static int node;
    static int edge;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] check;
    static int[] distance;

    public void bfs(int v) {
        Queue<Integer> q = new ArrayDeque<>();

        q.offer(v);

        check[v] = 1;
        distance[v] = 0;

        while (!q.isEmpty()) {
            int cur = q.poll();

            for (int i : graph.get(cur)) {
                if (check[i] == 0) {
                    distance[i] = distance[cur] + 1;
                    check[i] = 1;
                    q.offer(i);
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
        check = new int[node+1];
        distance = new int[node+1];

        graph = new ArrayList<ArrayList<Integer>>();

        for (int i=0; i<=node; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int i=0; i<edge; i++) {
            st = new StringTokenizer(br.readLine());
            int to = Integer.parseInt(st.nextToken());
            int from = Integer.parseInt(st.nextToken());
            graph.get(to).add(from);
        }

        // for (int i=0; i<=node; i++) { 
        //     System.out.println(graph.get(i));
        // }

        m.bfs(1);

        for (int i=2; i<=node; i++) {
            System.out.println(i + " : " + distance[i]);
        }
    }
}