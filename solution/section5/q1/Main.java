package section5.q1;

import java.io.*;
import java.util.*;

public class Main {
    public int solution(int no, String paper) {
        int answer = 0;

        char[] arr = paper.toCharArray();

        for (int i=0; i < no; i++) {
            System.out.println(arr[i]);
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