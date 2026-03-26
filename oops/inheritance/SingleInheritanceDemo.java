class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {

        // Creating child class object
        Dog d = new Dog();

        // Inherited method
        d.eat();

        // Child method
        d.bark();
    }
}
