package seven;

import static six.Print.print;

class Frog extends Amphibian {
    void beFrog() {
    }

    void jump() {
        print("Frog jump");
    }

    void voice() {
        print("Frog kva");
    }

    void run(Frog frog){
        print("Frog run");
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.jump();
        frog.voice();
        frog.run(frog);
    }
}
