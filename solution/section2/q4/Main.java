package section2.q4;

import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public String solution(String word) {
        char[] arr = word.toCharArray();

        String newWord = "";

        for (int i=arr.length-1; i>=0; i--) {
            newWord = newWord + arr[i];
        }

        return newWord;
    }
    
    public static void main(String[] args) throws Exception {
        Main m = new Main();

        int num = Integer.parseInt(br.readLine());

        for (int i=0; i < num; i++) {
            System.out.println(m.solution(br.readLine()));
        }
    }
}
