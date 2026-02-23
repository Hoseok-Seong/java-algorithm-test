package section6.q4;

import java.io.*;
import java.util.*;

public class Main {
    // 352+*9-
    public int solution(String str) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();

                int tmp = 0;

                if (c == '+') {
                    tmp = a + b;
                } else if (c == '-') {
                    tmp = a - b;
                } else if (c == '*') {
                    tmp = a * b;
                } else if (c == '/') {
                    tmp = a / b;
                }

                stack.push(tmp);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(m.solution(str));
    }
}