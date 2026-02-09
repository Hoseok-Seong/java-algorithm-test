package section2.q5;

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

        while (lt < rt) {
            if (!Character.isAlphabetic(arr[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(arr[rt])) {
                rt--;
            }
            else {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;

                lt++;
                rt--;
            }
        }

        return String.valueOf(arr);
    }
    
    public static void main(String[] args) throws Exception {
        Main m = new Main();

        System.out.println(m.solution(br.readLine()));
    }
}
