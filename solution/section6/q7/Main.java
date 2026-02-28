package section6.q7;

import java.io.*;
import java.util.*;

public class Main {
    public String solution(String subject, String schedule) {
        String answer = "YES";

        Queue<Character> q = new ArrayDeque<>();

        for (char c : subject.toCharArray()) {
            q.offer(c);
        }

        for (char c : schedule.toCharArray()) {
            if (q.contains(c)) {
                if (c != q.poll()) return "NO";
            }
        }

        if (!q.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String subject = br.readLine();
        String schedule = br.readLine();

        System.out.println(m.solution(subject, schedule));
    }
}