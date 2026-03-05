package section9.q1;

import java.io.*;
import java.util.*;

// 6
// 1 3 5 6 7 10  
public class Main {
    static int n;
    static int total;
    static int[] arr;
    boolean flag = false;
    static String answer = "NO";

    public void dfs(int level, int sum, int[] arr) {
        if (flag) {
            return;
        }

        if (sum > total / 2) {
            return;
        }

        // 끝까지 다 내려갔을 때
        if (level == n) {
            if (total - sum == sum) {
                answer = "YES";
                flag = true;
            }
        }
        else {
            dfs(level+1, sum + arr[level], arr);
            dfs(level+1, sum, arr);
        }
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            total += arr[i];
        }

        m.dfs(0, 0, arr);
        System.out.println(answer);
    }
}
