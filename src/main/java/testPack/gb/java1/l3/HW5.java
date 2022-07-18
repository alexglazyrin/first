package testPack.gb.java1.l3;

import java.util.Arrays;

public class HW5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArray(5,101)));
        System.out.println(Arrays.toString(createArray(10,4)));

    }

    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
