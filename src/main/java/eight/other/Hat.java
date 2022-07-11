package eight.other;

import static six.Print.print;

class Hat extends Percussion {
    void play(Note n) {
        print("Hat.play()" + n);
    }
    String what(){return "Hat";}
}
