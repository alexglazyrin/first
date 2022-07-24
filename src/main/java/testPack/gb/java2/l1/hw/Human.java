package testPack.gb.java2.l1.hw;

public class Human {
    private final int MAX_RHD = 4000;
    private final int maxHeight = 3;

    void run() {
        System.out.println("Human run");
    }

    void jump() {
        System.out.println("Human jump");
    }

    public int getMaxHeight() {
        return maxHeight;
    }
}
