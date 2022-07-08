package eight;

import static six.Print.print;

class Brass extends Instrument {
    public void play(Note n){
        print("Brass.play() " + n);
    }
}
