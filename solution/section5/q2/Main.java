package section5.q2;

import java.io.*;
import java.util.*;

public class Main {
    // public String solution(String word1, String word2) {
    //     HashMap<Character, Integer> map = new HashMap<>();

    //     for (char c : word1.toCharArray()) {
    //         map.put(c, map.getOrDefault(c, 0) + 1);
    //     }

    //     for (char c : word2.toCharArray()) {
    //         if (!map.containsKey(c) || map.get(c) == 0) {
    //             return "NO";
    //         }
    //         map.put(c, map.get(c) - 1);
    //     }

    //     return "YES";
    // }
    public String solution(String word1, String word2) {
        String answer = "NO";

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : word2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        if (map1.equals(map2)) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word1 = br.readLine();
        String word2 = br.readLine();

        System.out.println(m.solution(word1, word2));
    }
}