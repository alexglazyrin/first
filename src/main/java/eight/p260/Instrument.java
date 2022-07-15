package eight.p260;

import eight.other.Note;

/*abstract class Instrument {
    private int i;
    public abstract void play(Note n);
    public String what(){return "Instrument";}
    public abstract void adjust();
}*/

interface Instrument {
    int VALUE = 5;
    void play(Note n);
    void adjust();
}
