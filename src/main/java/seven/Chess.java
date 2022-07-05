package seven;

import static six.Print.print;

public class Chess extends BoardGame{
    Chess(){
        super(11);
        print("Constructor Chess");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
