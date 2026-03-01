package section8.q5;

// 재귀 / DFS / Back Tracking / 스택 프레임 / 이진트리 순회 에 대한 개념을 위한 중요한 예제
//    1
//  2   3 
// 4 5 6 7
// 루트를 방문하는 위치에 따라서 아래 3가지로 나뉨
// 전위 순회 : 루트 왼쪽 오른쪽 (루왼오)
// 중위 순회 : 왼쪽 루트 오른쪽 (왼루오)
// 후위 순회 : 왼쪽 오른쪽 루트 (왼오루)
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
    Node root;

    public void recursive(Node node) {
        if (node == null) {
            return;
        } else {
            recursive(node.lt);
            recursive(node.rt);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) throws Exception {
        Main tree = new Main();

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.recursive(tree.root);
    }
}