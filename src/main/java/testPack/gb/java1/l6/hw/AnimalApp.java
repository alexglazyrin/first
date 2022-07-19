package testPack.gb.java1.l6.hw;

public class AnimalApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik","white",3,true);
        Dog dog = new Dog();
        cat.run(190);
        cat.swim(5);
        dog.run(490);
        dog.swim(9);
    }
}
