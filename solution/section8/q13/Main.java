package section8.q13;

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
    static ArrayList<ArrayList<Integer>> graph;
    static int[] check;

    public void dfs(int v) {
        if (v == node) {
            answer++;
        } else {
            for (int i : graph.get(v)) {
                if (check[i] == 0) {
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
        check = new int[node+1];
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

        check[1] = 1;
        m.dfs(1);
        System.out.println(answer);
    }
}