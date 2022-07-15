package eight.p260;

import eight.other.Note;

import static six.Print.print;

class Wind /*extends Instrument*/implements Instrument{
    //private int i;
    public void play(Note n){
        //print("Wind.play() " + n);
        print(this + ".play() " + n);
    }
    //public String what(){return "Wind";}
    public String toString(){return "Wind";}
    public void adjust(){print(this + ".adjust()");}
}
