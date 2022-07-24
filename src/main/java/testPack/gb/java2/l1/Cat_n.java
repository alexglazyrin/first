package testPack.gb.java2.l1;

public class Cat_n {
    private String name;
    String color;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0){
            this.age = age;
        }else {
            System.out.println("Введен некорректный возраст");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat_n(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Cat_n(String name){
        this.name = name;
        this.color = "None";
        this.age = 1;
    }

    public void info(){
        System.out.println(name + " " + color + " " + age);
    }

    public void putMeInArray(Cat_n[] catNS, int arrayIndex){
        catNS[arrayIndex] = this;
    }
}
