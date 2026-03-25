package section7.q3;

import java.io.*;
import java.util.*;

public class Main {
    // 삽입정렬
    // 입력
    // 6
    // 11 7 5 6 10 9
    // 출력
    // 5 6 7 9 10 11
    public String solution(int n, int[] arr) {
        StringBuilder sb = new StringBuilder();

        // 구현부
        for (int i=1; i<n; i++) {
            int tmp = arr[i];
            int j;
            for (j=i-1; j>=0; j--) {
                if (arr[j] > tmp) {
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = tmp;
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