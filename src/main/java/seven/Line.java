package seven;

import static six.Print.print;

class Line extends Shape{
    private int start, end;
    Line(int start, int end){
        super(start);
        this.start = start;
        this.end = end;
        print("Draw line Line: " + start + ", " + end);
    }

    @Override
    void dispose() {
        print("Delete line Line: " + start + ", " + end);
        super.dispose();
    }
}
