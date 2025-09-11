import java.util.Objects;

class Car {
    /*

    Field: General Representation of Car, if we want to create
    the type of car we need, we must create a Constructor.

    */

    // field
    private String type;
    private String model;
    private String color;
    private int speed;

    // constructor
    public Car(String type, String model, String color, int speed) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    // Car(){} <-- empty constructor(default constructor) that would initialize all field of the objects with their default values.

    // Getter(read) and Setter(modify) in public
    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // method
    int increaseSpeed (int increment) {
        this.speed += increment;
        return this.speed;
    }

    @Override
    public String toString() {
        return "Car [type=" + type + " model=" + model + " color=" + color + " speed="+speed+ "]";
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;
        return speed == car.speed && Objects.equals(type, car.type) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Car focus = new Car("Ford", "Focus", "red", 0);
        focus.increaseSpeed(30);

        System.out.println(focus);

//        System.out.printf("%s %s %s %d\n",
//                focus.getType(),
//                focus.getModel(),
//                focus.getColor(),
//                focus.getSpeed());
    }
}
