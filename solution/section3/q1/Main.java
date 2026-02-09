package section3.q1;

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public String solution(int no, String nos) {
        st = new StringTokenizer(nos);

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i=0; i<no; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        sb.append (arr.get(0) + " ");

        for (int i=1; i<no; i++) {
            if (arr.get(i-1) < arr.get(i)) {
                sb.append (arr.get(i) + " ");
            }
        } 

        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        int no = Integer.parseInt(br.readLine());
        String nos = br.readLine();

        System.out.println(m.solution(no, nos));
    }
}
