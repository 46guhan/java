/* 
TreeSet is a class in the Java Collections Framework that stores unique elements in sorted order.
TreeSet internally uses Tree (Red-Black Tree) data structure.

Features of TreeSet
Stores unique elements only
Automatically sorts elements
Does not allow duplicates
Does not allow null values
Slower than HashSet

Use TreeSet when:
You need sorted data
You need unique values
Order matters (sorted order)
 */

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        // Create TreeSet
        TreeSet<Integer> set = new TreeSet<>();

        // add()
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(40);

        System.out.println("TreeSet (Sorted): " + set);

        // first()
        System.out.println("First Element: " + set.first());

        // last()
        System.out.println("Last Element: " + set.last());

        // higher()
        System.out.println("Higher than 30: " + set.higher(30));

        // lower()
        System.out.println("Lower than 30: " + set.lower(30));

        // contains()
        System.out.println("Contains 20? " + set.contains(20));

        // remove()
        set.remove(40);
        System.out.println("After remove(): " + set);

        // size()
        System.out.println("Size: " + set.size());

        // Loop
        System.out.println("Using for-each:");
        for(Integer num : set) {
            System.out.println(num);
        }

        // clear()
        set.clear();
        System.out.println("After clear(): " + set);
    }
}