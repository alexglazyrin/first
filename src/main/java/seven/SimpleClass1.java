package seven;

import static six.Print.print;

class SimpleClass1 {
    private String s;
    private int i = 1;

    SimpleClass1() {
        print("SimpleClass1 print");
        s = "constructed s" + i + " " + getClass();
        i++;
    }

    private void schet(int i) {

    }

    public String toString() {
        return s;
    }
}
