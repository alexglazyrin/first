package five.example;

public class Mugs {
    Mug mug1;
    Mug mug2;
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 инициализированы");
    }
    Mugs(){
        System.out.println("Mugs()");
    }
    Mugs(int i){
        System.out.println("Mugs(int)");
    }

    public static void main(String[] args) {
        System.out.println("В метода main()");
        new Mugs();
        System.out.println("new Mugs() завершено");
        new Mugs(1);
        System.out.println("new Mugs(1) завершено");
    }
}
