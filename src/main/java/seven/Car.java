package seven;

import static six.Print.print;

public class Car {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door
    left = new Door(),
    right = new Door();
    public Car(){
        for (int i = 0; i < 4; i++)
            wheel[i] = new Wheel();
    }

    void service(){
        print("method service");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
        car.service();
    }
}
