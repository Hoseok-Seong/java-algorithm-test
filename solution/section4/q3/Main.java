package section4.q3;

import java.io.*;
import java.util.*;

public class Main {
    // 10 3
    // 12 15 11 20 25 10 20 19 13 15
    public int solution(int no, int days, String memo) {
        int max = Integer.MIN_VALUE;
        int answer = 0;

        int[] arr = new int[no];

        StringTokenizer st = new StringTokenizer(memo);

        for (int i=0; i<no; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 초기 세팅
        for (int i=0; i<days; i++) {
            answer += arr[i];
        }

        max = answer;

        for (int i=days; i<no; i++) {
            answer -= arr[i-days];
            answer += arr[i];

            max = Math.max(max, answer);
        }

        return max;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int no = Integer.parseInt(st.nextToken());
        int days = Integer.parseInt(st.nextToken());
        String memo = br.readLine();

        System.out.println(m.solution(no, days, memo));
    }
}