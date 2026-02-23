package section6.q2;

import java.io.*;
import java.util.*;

public class Main {
    // (A(BC)D)EF(G(H)(IJ)K)LM(N)
    public String solution(String str) {
        StringBuilder sb = new StringBuilder();

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            if (c == '(') stack.push(c);
            else if (c == ')') stack.pop();
            else {
                if (stack.isEmpty()) sb.append(c);
                else {
                    continue;
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(m.solution(str));
    }
}