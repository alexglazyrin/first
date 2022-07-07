package testPack;


public class MainC {
    public static void main(String[] args) {
        Car car1 = new Car("Roadster", "GT400", 4);
        Truck truck1 = new Truck("Sam", "FH14", 6,2000);
        //car1.speed(250);
        //truck1.speed(110);
        car1.info();
        truck1.info();
    }
}
