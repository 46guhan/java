/* 
Features of HashSet
Stores only unique values
Does not maintain insertion order
Allows one null value
Fast performance
No duplicate values allowed

Use HashSet when:
You want unique values
Order is not important
Fast searching needed
 */
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String[] args) {

        // Create HashSet
        HashSet<String> set = new HashSet<>();

        // add()
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); // Duplicate

        System.out.println("HashSet: " + set);

        // contains()
        System.out.println("Contains Java? " + set.contains("Java"));

        // remove()
        set.remove("Python");
        System.out.println("After remove(): " + set);

        // size()
        System.out.println("Size: " + set.size());

        // isEmpty()
        System.out.println("Is Empty? " + set.isEmpty());

        // Loop using for-each
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
