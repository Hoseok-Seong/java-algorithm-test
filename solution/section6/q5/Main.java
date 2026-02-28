package section6.q5;

import java.io.*;
import java.util.*;

public class Main {
    // ()(((()())(())()))(())
    public int solution(String line) {
        int answer = 0;

        Deque<Character> stack = new ArrayDeque<>();

        char last = ' ';

        for (char c : line.toCharArray()) {
            if (c == '(') {
                stack.push(c);
                last = c;
            } else if (c == ')') {
                if (last == '(') {
                    answer += stack.size() - 1;
                } else {
                    answer += 1;
                }

                stack.pop();
                last = c;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        System.out.println(m.solution(line));
    }
}
