// Abstract Class
abstract class Vehicle {

    // Abstract method (no body)
    abstract void start();

    // Concrete method (with body)
    void fuelType() {
        System.out.println("Vehicle uses fuel or electricity");
    }
}

// Child Class 1
class Car extends Vehicle {

    // Implementing abstract method
    @Override
    void start() {
        System.out.println("Car starts with a key or button");
    }
}

// Child Class 2
class Bike extends Vehicle {

    // Implementing abstract method
    @Override
    void start() {
        System.out.println("Bike starts with a kick or button");
    }
}

// Main Class
public class AbstractClassDemo {

    public static void main(String[] args) {

        // Vehicle v = new Vehicle(); // ❌ Not allowed (cannot create object of abstract class)

        Vehicle v1 = new Car();
        v1.start();
        v1.fuelType();

        System.out.println();

        Vehicle v2 = new Bike();
        v2.start();
        v2.fuelType();
    }
}
