package ru.testekkel.oper3.equivalence;

public class EqualsDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.name = "spot";
        dog2.name = "scruffy";
        dog1.says = dog2.says = "uaf!";
        dog3 = dog1;

        System.out.println("dog1. name: " + dog1.name + " says: " + dog1.says);
        System.out.println("dog2. name: " + dog2.name + " says: " + dog2.says);
        System.out.println(dog1.equals(dog3));

    }
}
