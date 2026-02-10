package section3.q4;

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public String solution(int no) {
        int a = 1;
        int b = 1;

        for (int i=0; i<no; i++) {
            if (i==0) {
                sb.append(a + " ");
                continue;
            }

            if (i==1) {
                sb.append(b + " ");
                continue;
            }

            int tmp = a + b;
            a = b;
            b = tmp;
            
            sb.append(b + " ");

            tmp = 0;
        }

        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        int no = Integer.parseInt(br.readLine());

        System.out.println(m.solution(no));
    }
}