package section3.q7;

import java.io.*;
import java.util.*;

public class Main {
    public int solution(int n, String nos) {
        int answer = 0;

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(nos);

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int seq = 1;

        for (int i=0; i<n; i++) {
            if (arr[i] == 0) {
                seq = 1;
            } else {
                if (arr[i] == 1) {
                    arr[i] = seq;
                    seq++;
                }
            }
            answer += arr[i];
        }

        return answer;
    }
    
    public static void main(String[] args) throws Exception {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String nos = br.readLine();

        System.out.println(m.solution(n, nos));
    }
}
