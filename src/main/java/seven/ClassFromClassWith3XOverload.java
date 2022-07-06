package seven;

import static six.Print.print;

public class ClassFromClassWith3XOverload extends ClassWith3XOverload{
    float gMeth(float f){
        print("Float f");
        return 1.5f;
    }

    public static void main(String[] args) {
        ClassFromClassWith3XOverload cl = new ClassFromClassWith3XOverload();
        cl.gMeth(2.5f);
        cl.gMeth("Babobi");
        cl.gMeth(5);
        cl.gMeth('g');
    }
}
