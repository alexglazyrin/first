package eight.other;

public class TestCycle {
    public static void main(String[] args) {
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        u.ride(50);
        b.ride(100);
        t.ride(200);
    }
}
