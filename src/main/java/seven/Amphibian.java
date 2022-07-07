package seven;

import static six.Print.print;

class Amphibian {
    void jump() {
        print("jump");
    }

    void voice() {
        print("kva");
    }

    void run(Amphibian a) {
        a.jump();
        print("frog run");
    }
}
