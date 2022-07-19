package testPack.gb.java1.l6.hw;

public class Dog extends Animal {

    @Override
    void run(int runDist) {
        if (runDist < 500) {
            super.run(runDist);

        } else {
            System.out.println("Dogs cant run over 500 meters");
        }
    }

    @Override
    void swim(int swimDist) {
        if(swimDist<10){
            super.swim(swimDist);
        } else {
            System.out.println("Dogs cant swim over 10 meters!");
        }
    }
}
