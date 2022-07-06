package seven;

import static six.Print.print;

public class Stem extends Root{
    Stem(){
        Root r = new Root();
        /*Comp1 Component1 = new Comp1();
        Comp2 Component2 = new Comp2();
        Comp3 Component3 = new Comp3();*/
        print("Construstor Stem");
    }

    public static void main(String[] args) {
        Stem s = new Stem();
    }
}
