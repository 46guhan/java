
// Parent Class
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Child Class 1 (Method Overriding)
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Child Class 2 (Method Overriding)
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// Main Class
public class PolymorphismDemo {


    // Compile-Time Polymorphism (Method Overloading)

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

    
        // Compile-Time Polymorphism Demo
    
        System.out.println("--- Compile-Time Polymorphism ---");
        System.out.println("Add 2 numbers: " + add(10, 20));
        System.out.println("Add 3 numbers: " + add(10, 20, 30));

        System.out.println();

    
        // Run-Time Polymorphism Demo
    
        System.out.println("--- Run-Time Polymorphism ---");

        Shape s;   // parent class reference

        s = new Circle();
        s.draw();   // calls Circle's draw()

        s = new Rectangle();
        s.draw();   // calls Rectangle's draw()
    }
}
