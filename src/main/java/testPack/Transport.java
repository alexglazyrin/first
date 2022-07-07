package testPack;

import java.util.TreeSet;

import static six.Print.print;

public class Transport {
    protected String type, model;
    protected int wheels;
    Transport(String t, String m, int wh){
        this.type = t;
        this.model = m;
        this.wheels = wh;
    }

    protected int speed(int sp){
        print("Speed limit is " + sp + " km/h");
        return sp - 5;
    }
    public void info(){
        print(type);
        print(model);
        print(wheels);
    }
}
