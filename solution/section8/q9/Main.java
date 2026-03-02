package section8.q9;

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
    public int dfs(int edge, Node node) {
        if (node.lt == null && node.rt == null) {
            return edge;
        }
        else {
            return Math.min(dfs(edge+1, node.lt), dfs(edge+1, node.rt));
        }
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        Node root;

        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);

        System.out.println(m.dfs(0, root));
    }
}
