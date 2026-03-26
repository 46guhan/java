/*
 * EASY IDEA:
 * Stack → stores local variables
 * Heap  → stores objects
 */

class Person {
    String name; // stored inside object (Heap)

    Person(String name) {
        this.name = name;
    }
}

public class StackHeapSimple {

    public static void main(String[] args) {

        System.out.println("=== Stack and Heap Demo ===");

        // STACK MEMORY (primitive variable)
        int age = 21; // stored in Stack
        System.out.println("Age: " + age);

        // HEAP MEMORY (object)
        Person p1 = new Person("Guhan");
        // p1 → reference in Stack
        // new Person(...) → object in Heap

        System.out.println("Name: " + p1.name);

        System.out.println("=== Program End ===");
    }
}

/*
 * REMEMBER:
 *
 * int, double, boolean → Stack
 * Object reference → Stack
 * Actual object → Heap

 * SHORT TRICK:
 * Stack = Small & Fast
 * Heap  = Big & Shared
 */