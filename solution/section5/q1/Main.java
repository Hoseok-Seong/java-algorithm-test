package section5.q1;

import java.io.*;
import java.util.*;

public class Main {
    // 15
    // BACBACCACCBDEDE
    public Character solution(int no, String paper) {
        char answer = ' ';

        char[] arr = paper.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int max = Integer.MIN_VALUE;

        for (char x : map.keySet()) {
            max = Math.max(max, map.get(x));
            if (max == map.get(x)) {
                answer = x;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int no = Integer.parseInt(br.readLine());
        String paper = br.readLine();

        System.out.println(m.solution(no, paper));
    }
}