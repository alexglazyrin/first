package five.tasks;

import java.util.Random;

public class GenArr_g5t16 {
    public static void main(String[] args) {
        Random rand = new Random(47);
        String[] str = new String[10];
        for (int i = 0; i < str.length; i++){
            str[i] = rand.nextInt(500) + " ";
            System.out.print(str[i]);
        }

    }
}


