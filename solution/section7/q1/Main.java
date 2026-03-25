package section7.q1;

import java.io.*;
import java.util.*;

public class Main {
    // 입력
    // 6
    // 13 5 11 7 23 15
    // 출력
    // 5 7 11 13 15 23
    public String solution(int n, int[] arr) {
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[j] < arr[i]) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        
        for (int i=0; i<n; i++) {
            sb.append(arr[i] + " ");
        }

        return sb.toString();
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