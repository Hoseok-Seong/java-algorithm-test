package section6.q1;

import java.io.*;
import java.util.*;

public class Main {
    // (()(()))(()
    public String solution(String str) {
        String answer = "YES";

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            if (c == '(') stack.push(c);
            else {
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(m.solution(str));
    }
}