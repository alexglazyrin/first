package testPack.gb.java2.l1.p20;

import java.security.PublicKey;
import java.util.Objects;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat another = (Cat) o;
        return this.age == another.age && this.name.equals(another.name);
    }

    @Override
    public String toString(){
        return "Cat: " + name;
    }

    @Override
    public int hashCode() {
        return name.hashCode()+age * 71;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 5);
        Cat cat2 = new Cat("Барсик", 5);

        System.out.println(cat1.equals(cat2));
    }
}
