package section2.q8;

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    
    public String solution(String word) {
        char[] arr = word.toCharArray();

        int lt = 0;
        int rt = arr.length - 1;

        // found7, time: study; Yduts; emit, 7Dnuof
        while (lt < rt) {
            if (!Character.isLetter(arr[lt])) {
                lt++;

                continue;
            }

            if (!Character.isLetter(arr[rt])) {
                rt--;

                continue;
            }
                
            if (Character.toLowerCase(arr[lt]) != Character.toLowerCase(arr[rt])) {
                return "NO";
            }

            lt++;
            rt--;
        }

        return "YES";
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        System.out.println(m.solution(br.readLine()));
    }
}
