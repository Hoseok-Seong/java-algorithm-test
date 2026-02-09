package section2.q12;

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    // 4
    // #****###**#####**#####**##** 
    public String solution(int letterCnt, String word) {
        String answer = "";

        char[] arr = word.toCharArray();

        String no = "";

        int x=0;

        for (int i=0; i < letterCnt * 7; i++) {
            if (arr[i] == '#') {
                no += "1";
            } else {
                no += "0";
            }

            x++;

            if (x==7) {
                int a = Integer.parseInt(no, 2);
                // 아스키숫자 -> 문자
                char c = (char) a;
                answer += c;
                no="";
                x=0;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        int letterCnt = Integer.parseInt(br.readLine());

        String word = br.readLine().trim();

        System.out.println(m.solution(letterCnt, word));
    }
}