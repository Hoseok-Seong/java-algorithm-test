package section7.q4;

import java.io.*;
import java.util.*;

public class Main {
    // 입력
    // 5 9
    // 1 2 3 2 6 2 3 5 7
    // 출력
    // 7 5 3 2 6
    public String solution(int size, int work, int[] arr) {
        StringBuilder sb = new StringBuilder();

        int[] cache = new int[size];

        for (int x : arr) {
            int pos = -1;

            for (int y=0; y<size; y++) {
                if (cache[y] == x) {
                    pos = y;
                    break;
                }
            }

            // miss
            if (pos == -1) {
                for (int z=size-1; z>0; z--) {
                    cache[z] = cache[z-1]; 
                }
            } 
            // hit
            else {
                for (int z=pos; z>0; z--) {
                    cache[z] = cache[z-1]; 
                }
            }

            cache[0] = x;
        }

        for (int x : cache) {
            sb.append(x + " ");
        }

        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int work = Integer.parseInt(st.nextToken());

        int[] arr = new int[work];

        st = new StringTokenizer(br.readLine());

        for (int i=0; i<work; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(m.solution(size, work, arr));
    }
}