package section4.q1;

import java.io.*;
import java.util.*;

public class Main {
    public String solution(int n1, int n2, int[] arr1, int[] arr2) {
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> arr = new ArrayList<>();

        int p1 = 0, p2 = 0;

        // 3
        // 1 3 5
        // 5
        // 2 3 6 7 9
        while (p1<n1 && p2<n2) {
            if (arr1[p1] < arr2[p2]) {
                arr.add(arr1[p1]);
                p1++;
                continue;
            } else {
                arr.add(arr2[p2]);
                p2++;
                continue;
            }
        }

        while (p1<n1) {
            arr.add(arr1[p1]);
            p1++;
            continue;
        }

        while (p2<n2) {
            arr.add(arr2[p2]);
            p2++;
            continue;
        }

        for (int i=0; i<n1+n2; i++) {
            sb.append(arr.get(i)).append(" ");
        }

        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n1 = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n1];

        st = new StringTokenizer(br.readLine());

        for (int i=0; i<n1; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int n2 = Integer.parseInt(br.readLine());
        int[] arr2 = new int[n2];

        st = new StringTokenizer(br.readLine());

        for (int i=0; i<n2; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(m.solution(n1, n2, arr1, arr2));
    }
}