package testPack.gb.java2.l1;

import java.util.Arrays;

public class CatDemoApp {
    public static void main(String[] args) {
        Cat_n catN1 = new Cat_n("Barsik");
        Cat_n catN2 = new Cat_n("Mursik", "Black", 5);
        Cat_n[] catNS = new Cat_n[2];
        catN1.info();
        catN1.putMeInArray(catNS,0);
        catN2.info();
        catN2.putMeInArray(catNS,1);
        System.out.println(Arrays.toString(catNS));
        catN1.setName("Vasiliy");
        catN1.info();
    }
}
