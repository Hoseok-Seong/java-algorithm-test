package section3.q6;

import java.io.*;
import java.util.*;

public class Main {
    public String solution(int no, String lists) {
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[no];

        StringTokenizer st = new StringTokenizer(lists);

        for (int i=0; i<no; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;

        for (int i=0; i<no; i++) {
            while(arr[i] != 0) {
                result = (result * 10) + (arr[i] % 10);
                arr[i] /= 10;
            }
            arr[i] = result;

            result = 0;
        }

        for (int i=0; i<no; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            }

            for (int j=2; j<arr[i]; j++) {
                if (arr[i] % j == 0) {
                    arr[i] = 0;
                    break;
                }
            }
        }

        for (int i=0; i<no; i++) {
            if (arr[i] != 0) {
                sb.append(arr[i] + " ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int no = Integer.parseInt(br.readLine());
        String lists = br.readLine();

        System.out.println(m.solution(no, lists));
    }
}