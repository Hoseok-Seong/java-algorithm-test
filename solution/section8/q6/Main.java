package section8.q6;

// 3
// 1 2 3
// 1 2
// 1 3
// 1
// 2 3
// 2
// 3
public class Main {
    static int n;
    static int[] arr;

    public void dfs(int t) {
        if (t == n+1) {
            StringBuilder sb = new StringBuilder();
            for (int i=1; i<=n; i++) {
                if (arr[i] == 1) {
                    sb.append(i + " ");
                }
            }
            // 공집합 제외
            if (sb.toString() != "") {
                System.out.println(sb.toString());
            }
        } else {
            arr[t] = 1;
            dfs(t+1);
            arr[t] = 0;
            dfs(t+1);
        }
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        n = 3;
        arr = new int[n+1];
        m.dfs(1);
    }
}
