package eight.p252;

import static six.Print.print;

public class Frog extends Amphibian{
    private Characteristic p = new Characteristic("квакает");
    private Description t = new Description("ест жуков");
    public Frog(){print("Frog()");}
    protected void dispose(){
        print("Завершение Frog");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        print("Пока!");
        frog.dispose();
    }
}
