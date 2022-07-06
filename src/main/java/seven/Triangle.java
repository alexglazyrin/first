package seven;

import static six.Print.print;

class Triangle extends Shape{
    Triangle(int i){
        super(i);
        print("Draw triangle");
    }

    @Override
    void dispose() {
        print("Delete triangle");
        super.dispose();
    }
}
