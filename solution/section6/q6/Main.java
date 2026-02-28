package section6.q6;

import java.io.*;
import java.util.*;

public class Main {
    public int solution(int prince, int number) {
        int answer = 0;

        Queue<Integer> circle = new ArrayDeque<>();

        for (int i=1; i<=prince; i++) {
            circle.offer(i);
        }

        while (!circle.isEmpty()) {
            for (int i=1; i<number; i++) {
                circle.offer(circle.poll());
            }

            circle.poll();

            if (circle.size() == 1) {
                answer = circle.poll();
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int prince = Integer.parseInt(st.nextToken());
        int number = Integer.parseInt(st.nextToken());

        System.out.println(m.solution(prince, number));
    }
}