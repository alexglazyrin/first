package seven;

import static six.Print.print;

class Cleanser {
    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" delute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        print(x);
    }
}
