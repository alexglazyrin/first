package seven;

import static six.Print.print;

public class SimpleClass2 {
    private int i;
    private SimpleClass1 exemplSC1;
    public SimpleClass2(){
        print("SimpleClass2 print");
        exemplSC1 = new SimpleClass1();
    }
    public String toString(){
        return "exemplSC1 = " + exemplSC1;
    }

    public static void main(String[] args) {
        SimpleClass2 s1 = new SimpleClass2();
        SimpleClass2 s2 = new SimpleClass2();
        print(s1);
        print(s2);
    }

}
