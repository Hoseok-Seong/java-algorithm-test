package section5.q5;

import java.io.*;
import java.util.*;

public class Main {
    // 10 3
    // 13 15 34 23 45 65 33 11 26 42
    public int solution(int no, int target, int[] arr) {
        int answer = -1;

        TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());

        for (int i=0; i<no; i++) {
            for (int j=i+1; j<no; j++) {
                for (int k=j+1; k<no; k++) {
                    tSet.add(arr[i] + arr[j] + arr[k]);                    
                }
            }
        }

        int cnt = 0;

        for (int i : tSet) {
            cnt++;
            if (cnt == target) return i;
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int no = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[no];

        for (int i=0; i<no; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(m.solution(no, target, arr));
    }
}