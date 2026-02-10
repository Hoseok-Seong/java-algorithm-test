package section3.q3;

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public String[] solution(int no, String a, String b) {
        int[] arrA = new int[no];
        int[] arrB = new int[no];
        String[] arrAnswer = new String[no];

        st = new StringTokenizer(a);

        for (int i=0; i<no; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(b);

        for (int i=0; i<no; i++) {
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        // 1 가위 2 바위 3 보
        for (int i=0; i<no; i++) {
            // 비기는 경우
            if (arrA[i] == arrB[i]) {
                arrAnswer[i] = "D";
            }
            // A가 이기는 경우
            else if ((arrA[i] == 1 && arrB[i] == 3) || (arrA[i] == 2 && arrB[i] == 1) || (arrA[i] == 3 && arrB[i] == 2)) {
                arrAnswer[i] = "A";   
            }
            // B가 이기는 경우
            else {
                arrAnswer[i] = "B";
            }
        }

        return arrAnswer;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        int no = Integer.parseInt(br.readLine());
        String a = br.readLine();
        String b = br.readLine();

        String[] arr = m.solution(no, a, b);

        for (int i=0; i<no; i++) {
            System.out.println(arr[i]);
        }
    }
}