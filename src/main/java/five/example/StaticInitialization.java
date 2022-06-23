package five.example;

public class StaticInitialization {
    public static void main(String[] args) {
        System.out.println("Создание нового объекта Cupboard в main()");
        new Cupboard();
        System.out.println("Создание нового объекта Cupboard в main()");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}
