package seven;

import static six.Print.print;

public class ClassWith3XOverload {
    String gMeth (String s){
        print("String s");
        return s;
    }
    int gMeth(int i){
        print("Int i");
        return i;
    }
    char gMeth(char c){
        print("Char c");
        return 'c';
    }
}
