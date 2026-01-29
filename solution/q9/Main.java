package q9;

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public int solution(String word) {
        char[] arr = word.toCharArray();
        
        String answer = "";

        for (char c : arr) {
            if (!Character.isDigit(c)) {
                continue;
            }

            if (answer.isEmpty() && c == '0') {
                continue;
            } else {
                answer += c;
            }
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        System.out.println(m.solution(br.readLine()));
    }
}