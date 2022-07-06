package seven;

import static six.Print.print;

public class ClassC extends ClassA{
    ClassB b = new ClassB(11);
    ClassC(){
        super(12);
        print("Constructor ClassC");
    }

    public static void main(String[] args) {
        ClassC c = new ClassC();
    }
}
