package section3.q12;

import java.io.*;
import java.util.*;

public class Main {
    // n: 학생수, m: 문제수
    public int solution(int n, int m, int[][] arr) {
        int answer = 0;

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                int cnt = 0;
                for (int k=0; k<m; k++) {
                    int pi = 0, pj = 0;
                    for (int l=0; l<n; l++) {
                        if (arr[k][l] == i) {
                            pi = l;
                        }
                        if (arr[k][l] == j) {
                            pj = l;
                        }
                    }
                    if (pi > pj) cnt++;
                }

                if (cnt == m) {
                    answer++;
                }
            }
        }

        return answer;
    }

    // 4 3
    // 3 4 1 2
    // 4 3 2 1
    // 3 1 4 2
    public static void main(String[] args) throws Exception {
        Main ma = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[m][n];

        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++) { 
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(ma.solution(n, m, arr));
    }
}