package seven;

import static six.Print.print;

public class Detergent extends Cleanser {
    public void scrub(){
        append(" Detergent.scrub()");
        super.scrub();
    }
    public void foam(){append(" foam()");}

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        print(x);
        print("Проверяем базовый класс");
        Cleanser.main(args);
    }
}
