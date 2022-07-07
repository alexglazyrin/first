package testPack;

public class Truck extends Transport{
    int gruz;
    Truck(String t, String m, int wh, int g) {
        super(t, m, wh);
        this.gruz = g;
    }
}
