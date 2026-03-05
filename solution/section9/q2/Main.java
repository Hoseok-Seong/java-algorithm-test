package section9.q2;

import java.io.*;
import java.util.*;

// 259 5
// 81
// 58
// 42
// 33
// 61 
public class Main {
    static int max = 0;
    static int n;
    static int[] arr;
    static int answer = 0;

    public void dfs(int level, int sum) {
        if (sum > max) {
            return;
        } else {
            answer = Math.max(answer, sum);
        }
        
        if (level == n) {
            return;
        } else {
            dfs(level+1, sum+arr[level]);
            dfs(level+1, sum);
        }
     }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        max = Integer.parseInt(st.nextToken());

        n = Integer.parseInt(st.nextToken());

        arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        m.dfs(0, 0);

        System.out.println(answer);
    }
}
