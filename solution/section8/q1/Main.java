package section8.q1;

public class Main {
    public void recursive(int i) {
        if (i == 0) {
            return;
        } else {
            recursive(i-1);
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        m.recursive(3);
    }
}