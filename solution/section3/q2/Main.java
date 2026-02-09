package section3.q2;

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public int solution(int no, String line) {
        st = new StringTokenizer(line);

        int[] list = new int[no];

        for (int i=0; i<no; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 1;
        int m = list[0];
        
        for (int x=1; x<no; x++) {
            if (m < list[x]) {
                m = list[x];
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        int no = Integer.parseInt(br.readLine());
        String line = br.readLine();

        System.out.println(m.solution(no, line));
    }
}
