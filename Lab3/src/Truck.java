public class Truck extends Car {

    // protected: accessible in same package and subclass
    protected int capacity;

    // constructor
    public Truck(String plate, int power, boolean automatic, int capacity) {

        // using super keyword for base type(parent), in this case is class Car
        super(plate, power, automatic);
        this.capacity = capacity;
    }

    @Override
    public void start() {
        System.out.println("Truck " + getPlate() + " with capacity " + capacity + " tons is starting.");
    }

    public void loadCargo(int weight) {
        System.out.println("Loading " + weight + " tons into truck " + getPlate());
    }
}