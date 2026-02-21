package section4.q6;

import java.io.*;
import java.util.*;

public class Main {
    public int solution(String word, char c) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        char c = br.readLine().charAt(0);

        System.out.println(m.solution(word, c));
    }
}