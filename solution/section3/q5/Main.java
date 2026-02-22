package section3.q5;

import java.io.*;

public class Main {
    public int solution(int no) {
        int answer = 0;

        int[] arr = new int[no+1];

        // 2부터 세기
        for (int i=2; i<=no; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int j=i; j<=no; j+=i) {
                    arr[j] = 1;
                }
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