package five.example;

public class PrimitiveOverloading {
    void f1(char x) {
        System.out.println("f1(char)");
    }
    void f1(byte x){
        System.out.println("f1(byte)");
    }
    void f1(short x){
        System.out.println("f1(short)");
    }
    void f1(int x){
        System.out.println("f1(int)");
    }
    void f1(long x){
        System.out.println("f1(long)");
    }
    void f1(float x){
        System.out.println("f1(float)");
    }
    void f1(double x){
        System.out.println("f1(double)");
    }

    void f2(byte x){
        System.out.println("f2(byte)");
    }
    void f2(short x){
        System.out.println("f2(short)");
    }
    void f2(int x){
        System.out.println("f2(int)");
    }
    void f2(long x){
        System.out.println("f2(long)");
    }
    void f2(float x){
        System.out.println("f2(float)");
    }
    void f2(double x){
        System.out.println("f2(double)");
    }

    void f3(short x){
        System.out.println("f3(sgort)");
    }
    void f3(int x){
        System.out.println("f3(int");
    }
    void f3(long x){
        System.out.println("f3(long)");
    }
    void f3(float x){
        System.out.println("f3(float)");
    }
    void f3(double x){
        System.out.println("f3(double)");
    }

    void f4(int x){
        System.out.println("f4(int)");
    }
    // не стал дописывать пример (стр. 149)
}
