package section9.q5;

import java.io.*;
import java.util.*;

public class Main {
    static int x;
    static int y;
    static Integer[] arr;
    static int answer = Integer.MAX_VALUE;

    public void dfs(int level, int sum) {
        if (level >= answer) {
            return;
        }

        if (sum > y) {
            return;
        }

        if (sum == y) {
            answer = Math.min(answer, level);
        }
        else {
            for (int i=0; i<x; i++) {
                dfs(level+1, sum+arr[i]);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        x = Integer.parseInt(br.readLine());

        arr = new Integer[x];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=0; i<x; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        y = Integer.parseInt(br.readLine());

        m.dfs(0, 0);

        System.out.println(answer);
    }
}