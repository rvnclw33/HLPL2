public class Main {
    public static void main(String[] args) {

        // Create Car objects
        Car car1 = new Car("ABC-123", 150, true);
        Car car2 = new Car("XYZ-456", 200, false);

        car1.start();
        car1.stop();
        car2.printInfo();

        // Create Truck Object
        Truck truck1 = new Truck("TRK-001", 400, true, 10);
        truck1.start();
        truck1.loadCargo(5);

        System.out.println("Total number of cars created: " + Car.numberOfCars);
    }
}
