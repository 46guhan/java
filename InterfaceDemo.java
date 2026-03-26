
// Interface Declaration
// An interface is a blueprint of a class
// It contains abstract methods (by default) and constants
interface Vehicle {

    // Public, static, and final by default
    int SPEED_LIMIT = 80;

    // Abstract method (no body)
    void start();
}

// First Implementation Class
class Car implements Vehicle {

    // Implementing interface method
    @Override
    public void start() {
        System.out.println("Car starts with a key or button");
    }
}

// Second Implementation Class
class Bike implements Vehicle {

    // Implementing interface method
    @Override
    public void start() {
        System.out.println("Bike starts with a kick or button");
    }
}

// Main Class
public class InterfaceDemo {

    public static void main(String[] args) {

        // Interface reference pointing to Car object
        Vehicle v1 = new Car();
        v1.start();
        System.out.println("Speed Limit: " + Vehicle.SPEED_LIMIT);

        System.out.println();

        // Interface reference pointing to Bike object
        Vehicle v2 = new Bike();
        v2.start();
        System.out.println("Speed Limit: " + Vehicle.SPEED_LIMIT);
    }
}
