package section7.q5;

import java.io.*;
import java.util.*;

public class Main {
    // 8
    // 20 25 52 30 39 33 43 33
    public String solution(int n, int[] arr) {
        String answer = "U";

        Arrays.sort(arr);

        for (int i=0; i<n-1; i++) {
            if (arr[i] == arr[i+1]) {
                return "D";
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(m.solution(n, arr));
    }
}