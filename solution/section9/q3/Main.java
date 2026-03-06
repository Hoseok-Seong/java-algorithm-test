package section9.q3;

import java.io.*;
import java.util.*;

// 5 20
// 10 5
// 25 12
// 15 8
// 6 3
// 7 4
public class Main {
    static int n;
    static int limit;
    static int[] score;
    static int[] time;
    static int answer = 0;

    public void dfs(int level, int sum, int curTime) {
        if (curTime > limit) {
            return;
        }

        // 부분집합이 완성됨
        if (level == n) {
            answer = Math.max(answer, sum);
        } else {
            dfs(level+1, sum+score[level], curTime+time[level]);
            dfs(level+1, sum, curTime);
        }
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        limit = Integer.parseInt(st.nextToken());

        score = new int[n];
        time = new int[n];

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            score[i] = Integer.parseInt(st.nextToken());
            time[i] = Integer.parseInt(st.nextToken());
        }

        m.dfs(0, 0, 0);

        System.out.println(answer);
    }
}