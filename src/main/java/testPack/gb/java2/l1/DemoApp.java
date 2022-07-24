package testPack.gb.java2.l1;

public class DemoApp   {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.voice();
        if(animal instanceof Cat){
            // ((Cat)animal).methodFromCatClass();
            System.out.println("В animal действительно лежит кот");
        }
    }
}
