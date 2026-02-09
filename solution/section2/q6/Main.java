package section2.q6;

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public String solution(String word) {
        String answer = "";

        for (int i=0; i < word.length(); i++) {
            if (word.indexOf(word.charAt(i)) == i) {
                answer += word.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        String word = br.readLine();

        System.out.println(m.solution(word));
    }
}
