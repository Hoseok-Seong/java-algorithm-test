package section3.q11;

import java.io.*;
import java.util.*;

public class Main {
    public int solution(int n, int[][] arr) {
        int max = Integer.MIN_VALUE;
        int leader = 0;

        // 학생수만큼 for문
        for (int i=0; i<n; i++) {
            int cnt = 0;

            for (int j=0; j<n; j++) {
                if (i==j) continue;
                // 1~5학년만큼 for문
                for (int x=0; x<5; x++) {
                    if (arr[i][x] == arr[j][x]) {
                        cnt++;
                        break;
                    }
                }
            }

            if (cnt > max) {
                max = Math.max(max, cnt);
                leader = i;
            }
        }
        return leader+1;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][5];

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        System.out.println(m.solution(n, arr));
    }
}