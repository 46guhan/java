/* 
ArrayList is a resizable array from the Java Collections Framework.

Unlike normal arrays:
Size can grow dynamically
Stores objects only
Maintains insertion order
Allows duplicate values

Use ArrayList when:
You need dynamic size
Fast data access
Less insertion/deletion in middle 
*/

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> list = new ArrayList<>();

        // add()
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Java");

        System.out.println("ArrayList: " + list);

        // get()
        System.out.println("Element at index 1: " + list.get(1));

        // set()
        list.set(2, "JavaScript");
        System.out.println("After set(): " + list);

        // remove()
        list.remove("Python");
        System.out.println("After remove(): " + list);

        // size()
        System.out.println("Size: " + list.size());

        // contains()
        System.out.println("Contains Java? " + list.contains("Java"));

        // indexOf()
        System.out.println("Index of Java: " + list.indexOf("Java"));

        // isEmpty()
        System.out.println("Is Empty? " + list.isEmpty());

        // sort()
        Collections.sort(list);
        System.out.println("Sorted: " + list);

        // Loop using for-each
        System.out.println("Loop using for-each:");
        for(String lang : list) {
            System.out.println(lang);
        }

        // clear()
        list.clear();
        System.out.println("After clear(): " + list);
    }
}
