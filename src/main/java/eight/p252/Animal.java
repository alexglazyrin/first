package eight.p252;

import static six.Print.print;

class Animal extends LivingCreature {
    private Characteristic p = new Characteristic("имеет сердце");
    private Description t = new Description("животное, не растение");
    Animal(){
        print("Animal()");
    }
    protected void dispose(){
        print("dispose() в Animal");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
