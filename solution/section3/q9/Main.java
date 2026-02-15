package section3.q9;

import java.io.*;
import java.util.*;

public class Main {
    public int solution(int n, int[][] arr) {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;

        int max = 0;
        // 5
        // 10 13 10 12 15
        // 12 39 30 23 11
        // 11 25 50 53 15
        // 19 27 29 37 27
        // 19 13 30 13 19
        // 각 행의 합, 각 열의 합
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            max = Math.max(max, sum1);
            max = Math.max(max, sum2);
            sum1 = 0;
            sum2 = 0;
        }
        // 00 11 22 33 44
        // 04 13 22 31 40
        for (int i=0; i<n; i++) {
            sum3 += arr[i][i];
            sum4 += arr[i][n-i-1];

            max = Math.max(max, sum3);
            max = Math.max(max, sum4);
        }

        return max;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        System.out.println(m.solution(n, arr));
    }
}