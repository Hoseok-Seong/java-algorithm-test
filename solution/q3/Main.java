package q3;

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public String solution(String word) {
        if (word == null || word.isEmpty()) {
            return "";
        }

        st = new StringTokenizer(word);

        String answer = "";
        String stWord = "";
        int len = 0;

        while (st.hasMoreTokens()) {
            stWord = st.nextToken();

            if (stWord.length() > len) {
                answer = stWord;
                len = answer.length();
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