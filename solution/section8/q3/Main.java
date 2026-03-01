package section8.q3;

public class Main {
    public int recursive(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i * recursive(i-1);
        }
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        System.out.println(m.recursive(5));
    }
}