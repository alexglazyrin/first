package testPack.gb.java1.l6;

public class Animal {
    String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo(){
        System.out.println("Animal: " + name);
    }

    public void jump(){
        System.out.println("Animal jump");
    }
    void voice(){
        System.out.println("Animal voice");
    }
}
