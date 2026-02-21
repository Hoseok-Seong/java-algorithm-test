package section4.q4;

import java.io.*;
import java.util.*;

public class Main {
    // 8 6
    // 1 2 1 3 1 1 1 2
    public int solution(int n, int k, int[] arr) {
        int cnt = 0;
        int answer = 0;
        int start = 0;

        for (int i=0; i<n; i++) {
            answer += arr[i];

            // 조건 만족할때까지 왼쪽 포인터 줄여야 함
            while (answer > k) {
                answer -= arr[start];
                start++;
            }

            if (answer == k) {
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(m.solution(n, k, arr));
    }
}