package five.example;

import java.util.Arrays;
import java.util.Random;

public class ArrayNew {
    public static void main(String[] args) {
        int [] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(40)];
        System.out.println("Длина a= " + a.length);
        System.out.println(Arrays.toString(a));
    }
}
