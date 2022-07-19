package testPack.gb.java1.l6.hw;

public class Cat extends Animal{
    private boolean hasStripes;
    Cat(String name, String color, int age, Boolean hasStripes){
        super(name, color, age);
        this.hasStripes = hasStripes;
    }

    @Override
    void run(int runDist) {
        if(runDist<200){
            super.run(runDist);
        } else {
            System.out.println("Cats cant run ower 200 meters!");
        }
    }

    @Override
    void swim(int jumpDist) {
        System.out.println("Cats cant swim!");
    }
}
