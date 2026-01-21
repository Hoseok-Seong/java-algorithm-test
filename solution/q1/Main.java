package q1;

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public int solution(String word, char c) {
        int answer = 0;

        char x = Character.toUpperCase(c);
        char[] arr = word.toUpperCase().toCharArray();

        for (char i : arr){
            if (i == x) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        String word = br.readLine();
        char c = br.readLine().charAt(0);

        System.out.println(m.solution(word, c));
    }
}