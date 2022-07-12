package eight.other;

import static six.Print.print;

public class Sandwitch extends PortableLunch{
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    public Sandwitch(){print("Sandwitch()");}

    public static void main(String[] args) {
        new Sandwitch();
    }
}
