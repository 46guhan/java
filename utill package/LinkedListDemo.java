/* 
LinkedList is a class in the Java Collections Framework that stores elements using nodes 
(not continuous memory like ArrayList).

Each element stores:
Data
Address of next element
Address of previous element (Doubly Linked List)

Use LinkedList when:
Frequent insertion/deletion
Memory flexibility needed
Not much random access required
 */
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // add()
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("LinkedList: " + list);

        // addFirst()
        list.addFirst("Start");
        System.out.println("After addFirst(): " + list);

        // addLast()
        list.addLast("End");
        System.out.println("After addLast(): " + list);

        // get()
        System.out.println("Element at index 2: " + list.get(2));

        // getFirst()
        System.out.println("First Element: " + list.getFirst());

        // getLast()
        System.out.println("Last Element: " + list.getLast());

        // remove()
        list.remove("Python");
        System.out.println("After remove(): " + list);

        // removeFirst()
        list.removeFirst();
        System.out.println("After removeFirst(): " + list);

        // removeLast()
        list.removeLast();
        System.out.println("After removeLast(): " + list);

        // size()
        System.out.println("Size: " + list.size());

        // contains()
        System.out.println("Contains Java? " + list.contains("Java"));

        // Loop
        System.out.println("Loop:");
        for(String item : list) {
            System.out.println(item);
        }

        // clear()
        list.clear();
        System.out.println("After clear(): " + list);
    }
}
