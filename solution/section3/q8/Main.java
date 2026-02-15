package section3.q8;

import java.io.*;
import java.util.*;

public class Main {
    public String solution(int n, String nos) {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(nos);

        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int rank = 1;

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (arr[i] < arr[j]) {
                    rank++;
                }
            }
            sb.append(rank + " ");
            rank = 1;
        }

        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String nos = br.readLine();

        System.out.println(m.solution(n, nos));
    }
}