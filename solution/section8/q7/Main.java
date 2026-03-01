package section8.q7;

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
    static Node root;

    public void bfs(Node node) {
        Deque<Node> q = new ArrayDeque<>();
        q.offer(node);

        int lvl = 0;

        while(!q.isEmpty()) {
            System.out.print(lvl + " : ");
            int len = q.size();
            for (int i=0; i<len; i++) {
                Node n = q.poll();
                System.out.print(n.data + " ");
                
                if (n.lt != null) {
                    q.offer(n.lt);
                }

                if (n.rt != null) {
                    q.offer(n.rt);
                }
            }
            lvl++;
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);

        m.bfs(root);
    }
}
