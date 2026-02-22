package section5.q4;

import java.io.*;
import java.util.*;

public class Main {
    // bacaAacba
    // abc
    public int solution(String word, String target) {
        int answer = 0;
        int lt = 0;

        HashMap<Character, Integer> targetMap = new HashMap<>();
        HashMap<Character, Integer> wordMap = new HashMap<>();

        // 타겟 세팅
        for (char c : target.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        char[] arr = word.toCharArray();

        for (int i=0; i<target.length() - 1; i++) {
            wordMap.put(arr[i], wordMap.getOrDefault(arr[i], 0) + 1);
        }

        for (int i=target.length() - 1; i<word.length(); i++) {
            wordMap.put(arr[i], wordMap.getOrDefault(arr[i], 0) + 1);
            if (targetMap.equals(wordMap)) {
                answer++;
            }
            wordMap.put(arr[lt], wordMap.getOrDefault(arr[lt], 0) - 1);

            if (wordMap.get(arr[lt]) == 0) {
                wordMap.remove(arr[lt]);
            }

            lt++;
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        String target = br.readLine();

        System.out.println(m.solution(word, target));
    }
}