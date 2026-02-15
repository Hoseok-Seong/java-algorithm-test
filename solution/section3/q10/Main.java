package section3.q10;

import java.io.*;
import java.util.*;

public class Main {
    // 5
    // 5 3 7 2 3
    // 3 7 1 6 1
    // 7 2 5 3 4
    // 4 3 6 4 1
    // 8 7 3 5 2
    public int solution(int n, int[][] arr) {
        int answer = 0;

        for (int i=1; i<n+1; i++) {
            for (int j=1; j<n+1; j++) {
                // 상 11 10
                if (arr[i][j] <= arr[i][j-1]) {
                    continue;
                }
                // 하 11 12
                if (arr[i][j] <= arr[i][j+1]) {
                    continue;
                }
                // 좌 11 01
                if (arr[i][j] <= arr[i-1][j]) {
                    continue;
                }
                // 우 11 21
                if (arr[i][j] <= arr[i+1][j]) {
                    continue;
                }
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n+2][n+2];

        for (int i=1; i<n+1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=1; j<n+1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        System.out.println(m.solution(n, arr));
    }
}