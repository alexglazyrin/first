package five.example;

public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup1.f(99);
    }
    //static Cups cup1 = new Cups();
    //static Cups cup2 = new Cups();
}
