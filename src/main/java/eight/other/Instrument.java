package eight.other;

import static six.Print.print;

class Instrument {
    void play(Note n) {
        print("Instrument.play()" + n);
    }

    String what() {
        return "Instrument";
    }

    void adjust() {
        print("Adjusting Instrument");
    }
}
