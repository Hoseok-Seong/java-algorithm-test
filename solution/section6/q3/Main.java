package section6.q3;

import java.io.*;
import java.util.*;

public class Main {
    public int solution(int n, int x, int[][] board, int[] moves) {
        int answer = 0;

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i : moves) {
            for (int j=0; j<n; j++) {
                if (board[j][i-1] != 0) {
                    int currentDoll = board[j][i-1];

                    if (stack.isEmpty()) {
                        stack.push(currentDoll);
                        board[j][i-1] = 0;
                        break;
                    }

                    int lastDoll = stack.pop();

                    if (lastDoll == currentDoll) {
                        answer += 2;
                        board[j][i-1] = 0;
                        break;
                    } else {
                        stack.push(lastDoll);
                        stack.push(currentDoll);
                        board[j][i-1] = 0;
                    }

                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[][] board = new int[n][n];

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j=0; j<n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int x = Integer.parseInt(br.readLine());

        int[] moves = new int[x];

        st = new StringTokenizer(br.readLine());

        for (int i=0; i<x; i++) {
            moves[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(m.solution(n, x, board, moves));
    }
}