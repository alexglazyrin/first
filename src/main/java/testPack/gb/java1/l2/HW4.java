package testPack.gb.java1.l2;

public class HW4 {
    public static void main(String[] args) {
        printer("Some text",5);
        printer("Next", 15);
        printer("The end", 7);

    }

    static void printer(String s, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
