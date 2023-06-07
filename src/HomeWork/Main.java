package HomeWork;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1");
        Car car2 = new Car("car2");

        Truck truck = new Truck("truck1",6);
        Truck truck2 = new Truck("truck2",8);

        Bicycle bicycle = new Bicycle("bicycle1");
        Bicycle bicycle2 = new Bicycle("bicycle2");

        car.check();
        car2.check();

        truck.check();
        truck2.check();

        bicycle.check();
        bicycle2.check();
    }
}
