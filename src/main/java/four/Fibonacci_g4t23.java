package four;

public class Fibonacci_g4t23 {
    public static void main(String[] args) {
        getFibonacci(20);
    }

    private static void getFibonacci(int n) {
        int a = 0;
        int b = 1;
        int c;
        System.out.print(b + " ");
        for (int i = 0; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}

