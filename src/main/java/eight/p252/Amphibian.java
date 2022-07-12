package eight.p252;

import static six.Print.print;

class Amphibian extends Animal{
    private Characteristic p = new Characteristic("может жить в воде");
    private Description t = new Description("и в воде, и на земле");
    Amphibian(){
        print("Amphibian()");
    }
    protected void dispose(){
        print("dispose() в Amphibian");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
