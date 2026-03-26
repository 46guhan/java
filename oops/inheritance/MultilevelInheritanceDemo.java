class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving...");
    }
}

class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric car is charging...");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {

        ElectricCar tesla = new ElectricCar();

        tesla.start();   // from Vehicle
        tesla.drive();   // from Car
        tesla.charge();  // from ElectricCar
    }
}
