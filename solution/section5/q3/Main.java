package section5.q3;

import java.io.*;
import java.util.*;

public class Main {
    // 7 4
    // 20 12 20 10 23 17 10
    public String solution(int days, int seq, int[] arr) {
        StringBuilder sb = new StringBuilder();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<seq-1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int lt=0;

        for (int i=seq-1; i<days; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            sb.append(map.size()).append(" ");

            map.put(arr[lt], map.get(arr[lt]) - 1);
            
            if (map.get(arr[lt]) == 0) {
                map.remove(arr[lt]);
            }

            lt++;
        }

        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int days = Integer.parseInt(st.nextToken());
        int seq = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[days];

        for (int i=0; i<days; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(m.solution(days, seq, arr));
    }
}