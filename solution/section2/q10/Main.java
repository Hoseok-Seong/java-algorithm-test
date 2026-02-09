package section2.q10;

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    // teachermode e
    public int[] solution(String word, char c) {
        int[] arr = new int[word.length()];

        // 최댓값 설정
        int p = word.length();

        for (int i=0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                p=0;
                arr[i] = p;
            } else {
                p++;
                arr[i] = p;
            }
        }

        p = word.length();

        for (int i=word.length()-1; i>=0; i--) {
            if (word.charAt(i) == c) {
                p=0;
            } else {
                p++;
                arr[i] = Math.min(p, arr[i]);
            }
        }

        return arr;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        st = new StringTokenizer(br.readLine());

        String word = st.nextToken();
        char c = st.nextToken().charAt(0);

        int[] arr = m.solution(word, c);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}