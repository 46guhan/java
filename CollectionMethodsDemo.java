import java.util.*;

public class CollectionMethodsDemo {

    public static void main(String[] args) {

        // Creating a Collection object using ArrayList
        Collection<String> col = new ArrayList<>();

        /* add() – add element */
        col.add("Java");
        col.add("Python");
        col.add("C++");
        System.out.println("After add(): " + col);

        /* size() – number of elements */
        System.out.println("Size: " + col.size());

        /* contains() – check element */
        System.out.println("Contains Java? " + col.contains("Java"));

        /* isEmpty() – check empty */
        System.out.println("Is Empty? " + col.isEmpty());

        /* remove() – remove element */
        col.remove("C++");
        System.out.println("After remove(): " + col);

        /* addAll() – add another collection */
        Collection<String> newCol = new ArrayList<>();
        newCol.add("HTML");
        newCol.add("CSS");

        col.addAll(newCol);
        System.out.println("After addAll(): " + col);

        /* containsAll() – check multiple */
        System.out.println("Contains all newCol? " + col.containsAll(newCol));

        /* removeAll() – remove group */
        col.removeAll(newCol);
        System.out.println("After removeAll(): " + col);

        /* retainAll() – keep common */
        Collection<String> retainCol = new ArrayList<>();
        retainCol.add("Java");

        col.retainAll(retainCol);
        System.out.println("After retainAll(): " + col);

        /* iterator() – traverse */
        System.out.print("Using Iterator: ");
        Iterator<String> it = col.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        /* toArray() – convert to array */
        Object[] arr = col.toArray();
        System.out.println("Array length: " + arr.length);

        /* clear() – remove all */
        col.clear();
        System.out.println("After clear(), Is Empty? " + col.isEmpty());
    }
}
