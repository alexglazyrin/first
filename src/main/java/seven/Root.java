package seven;

import static six.Print.print;

class Root {
    Root() {
        print("Constructor Root");
        Comp1 Component1 = new Comp1();
        Comp2 Component2 = new Comp2();
        Comp3 Component3 = new Comp3();
    }
}
