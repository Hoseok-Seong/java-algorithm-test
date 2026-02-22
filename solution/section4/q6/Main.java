package section4.q6;

import java.io.*;
import java.util.*;

public class Main {
    // 14 2
    // 1 1 0 0 1 1 0 1 1 0 1 1 0 1
    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        int lt = 0;
        int zeroCount = 0;

        for (int rt=0; rt<n; rt++) {
            if (arr[rt] == 0) {
                zeroCount++;
            }

            while(zeroCount > k) {
                if (arr[lt] == 0) {
                    zeroCount--;
                }
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }

        return answer;
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