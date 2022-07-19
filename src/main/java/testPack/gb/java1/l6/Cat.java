package testPack.gb.java1.l6;

public class Cat extends Animal{
    String color;
    /*public Cat(String name, String color){
        this.name = name;
        this.color = color;
    }
    public void catInfo(){
        System.out.println("Cat name: " + name + " color: " + color);
    }*/

    @Override
    void voice() {
        //super.voice();
        System.out.println("Cat meow");    }
}
