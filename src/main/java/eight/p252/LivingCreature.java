package eight.p252;

import static six.Print.print;

class LivingCreature {
    private Characteristic p = new Characteristic("живое существо");
    private Description t = new Description("обычное живое существо");
    LivingCreature(){
        print("LivingCreature()");
    }
    protected void dispose(){
        print("dispose() в LivingCreature ");
        t.dispose();
        p.dispose();
    }
}
