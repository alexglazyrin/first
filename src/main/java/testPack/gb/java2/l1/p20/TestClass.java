package testPack.gb.java2.l1.p20;

public class TestClass {
    public static void main(String[] args) {
        Callback c1 = new ClientOne();
        Callback c2 = new ClientTwo();
        c1.callback(1);
        c2.callback(2);
    }
}
