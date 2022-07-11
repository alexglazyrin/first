package eight.other;

import java.util.Random;

public class RandomInstrumentsGenerator {
    private Random rand = new Random(47);
    public Instrument next(){
        switch (rand.nextInt(6)){
            default:
            case 0: return new Wind();
            case 1: return new Woodwind();
            case 2: return new Hat();
            case 3: return new Stringed();
            case 4: return new Brass();
            case 5: return new Percussion();
        }
    }
}
