/* 
Features of HashMap
Stores Key-Value pairs
Keys must be unique
Values can be duplicate
Does not maintain order
Allows one null key
Allows multiple null values

Use HashMap when:
You want fast searching
You need key-value mapping
Order is not important
 */

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        // Create HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // put()
        map.put(101, "Java");
        map.put(102, "Python");
        map.put(103, "C++");
        map.put(104, "Java");

        System.out.println("HashMap: " + map);

        // get()
        System.out.println("Get key 102: " + map.get(102));

        // containsKey()
        System.out.println("Contains key 101? " + map.containsKey(101));

        // containsValue()
        System.out.println("Contains value Java? " + map.containsValue("Java"));

        // remove()
        map.remove(103);
        System.out.println("After remove(): " + map);

        // size()
        System.out.println("Size: " + map.size());

        // keySet()
        System.out.println("Keys: " + map.keySet());

        // values()
        System.out.println("Values: " + map.values());

        // entrySet()
        System.out.println("Key-Value pairs:");
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // isEmpty()
        System.out.println("Is Empty? " + map.isEmpty());

        // clear()
        map.clear();
        System.out.println("After clear(): " + map);
    }
}
