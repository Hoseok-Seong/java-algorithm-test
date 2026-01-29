package q7;

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

        String answer = "YES";

        while(lt < rt) {
            if (Character.toLowerCase(arr[lt]) != Character.toLowerCase(arr[rt])) {
                answer = "NO";
                break;
            } else {
                lt++;
                rt--;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        System.out.println(m.solution(br.readLine()));
    }
}
