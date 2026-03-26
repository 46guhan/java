/* 
Vector is a class in the Java Collections Framework that works like ArrayList but synchronized (thread-safe).

Vector is legacy class (old), but still important for exams and interviews.

Features of Vector
Dynamic array (Resizable)
Maintains insertion order
Allows duplicates
Thread-safe (Synchronized)
Slower than ArrayList
 */

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        // Create Vector
        Vector<String> vector = new Vector<>();

        // add()
        vector.add("Java");
        vector.add("Python");
        vector.add("C++");

        System.out.println("Vector: " + vector);

        // addElement()
        vector.addElement("JavaScript");
        System.out.println("After addElement(): " + vector);

        // get()
        System.out.println("Element at index 1: " + vector.get(1));

        // firstElement()
        System.out.println("First Element: " + vector.firstElement());

        // lastElement()
        System.out.println("Last Element: " + vector.lastElement());

        // size()
        System.out.println("Size: " + vector.size());

        // capacity()
        System.out.println("Capacity: " + vector.capacity());

        // remove()
        vector.remove("Python");
        System.out.println("After remove(): " + vector);

        // Loop
        System.out.println("Using for-each:");
        for(String item : vector) {
            System.out.println(item);
        }

        // clear()
        vector.clear();
        System.out.println("After clear(): " + vector);
    }
}
