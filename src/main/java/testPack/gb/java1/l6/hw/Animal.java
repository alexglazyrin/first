package testPack.gb.java1.l6.hw;

import testPack.gb.java1.l6.AbstractAnimal;

public class Animal {
    String name;
    String color;
    int age;
    Animal(){}

    Animal(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    void run(int runDist){
        System.out.println(name + " пробежал " + runDist);

    }
    void swim(int swimDist){
        System.out.println(name + " проплыл " + swimDist);

    }
}
