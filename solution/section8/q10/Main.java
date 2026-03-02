package section8.q10;

import java.util.*;

class Node {
    int data;
    Node lt;
    Node rt;

    public Node(int val) {
        this.data = val;
        lt = null;
        rt = null;
    }
}

public class Main {
    public int bfs(Node node) {
        int edge = 0;

        Deque<Node> q = new ArrayDeque<>();

        q.offer(node);

        while (!q.isEmpty()) {
            int len = q.size();

            for (int i=0; i<len; i++) {
                Node n = q.poll();

                if (n.lt == null && n.rt == null) {
                    return edge;
                }

                if (n.lt != null) {
                    q.offer(n.lt);
                }

                if (n.rt != null) {
                    q.offer(n.rt);
                }
            }
            edge++;
        }

        return 0;
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        Node root;

        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);

        System.out.println(m.bfs(root));
    }
}