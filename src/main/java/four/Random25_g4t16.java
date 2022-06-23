package four;

import static java.lang.Math.random;

public class Random25_g4t16 {
    public static void main(String[] args) {
        int b = 0;
        for (int i = 1; i <= 25; i++){
            System.out.print(i + ": ");
            int a = (int)(random()*5);
            if (a > b){
                System.out.println(a + " > " + b);
            } else if (a < b){
                System.out.println(a + " < " + b);
            } else System.out.println(a + " = " + b);
            b = a;
        }
    }
}
