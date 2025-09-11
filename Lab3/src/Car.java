public class Car implements Vehicle {

    // field
    private String plate;
    private int power;
    private boolean automatic;

    public static int numberOfCars = 0;

    // constructor
    public Car(String plate, int power, boolean automatic) {
        this.plate = plate;
        this.power = power;
        this.automatic = automatic;

        // can access directly in the class, doesn't need object reference (this.)
        numberOfCars++; // increment static field for every new Car
    }

    // interface methods
    @Override
    public void start() {
        System.out.println("Car " + plate + " is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car " + plate + " is stopping.");
    }

    // getter
    public String getPlate() {
        return plate;
    }

    public int getPower() {
        return power;
    }

    // careful with boolean type using "is" instead of "get"
    public boolean isAutomatic() {
        return automatic;
    }

    // method to print info
    public void printInfo() {
        System.out.println("Plate " + plate + " Power: " + power + " HP, Automatic: " + automatic);
    }
}
