package eight.p260;

import eight.other.Note;

import static six.Print.print;

class Stringed implements Instrument{
    public void play(Note n){
        print("Stringed.play() " + n);
    }
    public String what(){return "Stringed";}
    public void adjust(){}
}
