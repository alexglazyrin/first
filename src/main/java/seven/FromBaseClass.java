package seven;

import static six.Print.print;

public class FromBaseClass extends BaseClass{
    FromBaseClass(){
        super(2, "one");
        print("Constructor FromBaseClass default");
    }
    FromBaseClass(int i, String name){
        super(2, "two");
        print("Constructor FromBaseClass with args");
    }

    public static void main(String[] args) {
        FromBaseClass fBC = new FromBaseClass();
        //fBC.
    }
}
