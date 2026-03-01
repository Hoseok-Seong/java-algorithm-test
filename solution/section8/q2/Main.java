package section8.q2;

public class Main {
    public void recursive(int i) {
        if (i == 0) {
            return;
        } else {
            recursive(i / 2);
            System.out.print(i % 2 + " ");
        }
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        m.recursive(11);
    }
}