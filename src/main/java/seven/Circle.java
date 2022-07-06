package seven;

import static six.Print.print;

class Circle extends Shape {
    Circle(int i) {
        super(i);
        print("Draw circle");
    }

    @Override
    void dispose() {
        print("Delete circle");
        super.dispose();
    }
}
