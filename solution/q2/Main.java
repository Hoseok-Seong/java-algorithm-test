package q2;

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public String solution(String word) {
        String answer = "";
        
        char[] arr = word.toCharArray();

        for (char i : arr) {
            if (Character.isUpperCase(i)) {
                i = Character.toLowerCase(i);
            } else {
                i = Character.toUpperCase(i);
            }
            answer += i;
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        String word = br.readLine();

        System.out.println(m.solution(word));
    }
}