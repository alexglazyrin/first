package eight.p260;

import eight.other.Note;

import static six.Print.print;

class Percussion /*extends */implements Instrument{
    public void play(Note n){
        //print("Percussion.play() " + n);
        print(this + ".play() " + n);
    }
    //public String what(){return "Percussion";}
    public String toString(){return "Percussion";}
    public void adjust(){print(this + ".adjust()");}
}
