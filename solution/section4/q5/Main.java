package section4.q5;

import java.io.*;
import java.util.*;

public class Main {
    public int solution(int no) {
        int answer = 0;
        int sum = 0;
        int start = 1;

        for (int i=1; i<no; i++) {
            sum += i;
            while (sum > no) {
                sum -= start;
                start++;
            }
            if (sum == no) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int no = Integer.parseInt(br.readLine());

        System.out.println(m.solution(no));
    }
}