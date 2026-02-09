package section2.q11;

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public String solution(String word) {
        char[] arr = word.toCharArray();
        char prev = arr[0];
        int cnt = 1;

        for (int i=1; i<arr.length; i++) {
            if (arr[i] == prev) {
                cnt++;
            } else {
                sb.append(prev);

                if (cnt > 1) {
                    sb.append(cnt);
                }
                prev = arr[i];
                cnt = 1;
            }
        }

        sb.append(prev);

        if (cnt > 1) {
            sb.append(cnt);
        }

        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        String word = br.readLine();

        System.out.println(m.solution(word));
    }
}