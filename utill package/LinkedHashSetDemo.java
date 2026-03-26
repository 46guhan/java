/* 
LinkedHashSet is a class in the Java Collections Framework that stores unique elements 
like HashSet but maintains insertion order.

It is a combination of HashSet + LinkedList.

Features of LinkedHashSet
Stores unique elements only
Maintains insertion order
Allows one null value
Faster than TreeSet
No duplicate values allowed
 */

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        // Create LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // add()
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); // Duplicate

        System.out.println("LinkedHashSet: " + set);

        // contains()
        System.out.println("Contains Java? " + set.contains("Java"));

        // remove()
        set.remove("Python");
        System.out.println("After remove(): " + set);

        // size()
        System.out.println("Size: " + set.size());

        // isEmpty()
        System.out.println("Is Empty? " + set.isEmpty());

        // for-each loop
        System.out.println("Using for-each:");
        for(String lang : set) {
            System.out.println(lang);
        }

        // Iterator
        System.out.println("Using Iterator:");
        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // clear()
        set.clear();
        System.out.println("After clear(): " + set);
    }
}
