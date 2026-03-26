import java.util.*;

public class MethodsDemo {

    public static void main(String[] args) {

        /* 
        1. ARRAY METHODS (Arrays class)
         */

        int[] arr = {4, 1, 7, 3, 2};

        System.out.println(arr);

        // toString()
        System.out.println("Array: " + Arrays.toString(arr));

        // sort()
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // binarySearch()
        System.out.println("Index of 3: " + Arrays.binarySearch(arr, 3));

        // copyOf()
        int[] newArr = Arrays.copyOf(arr, 7);
        System.out.println("Copied Array: " + Arrays.toString(newArr));

        // equals()
        int[] arr2 = {1, 2, 3, 4, 7};
        System.out.println("Arrays equal? " + Arrays.equals(arr, arr2));

        // fill()
        Arrays.fill(newArr, 9);
        System.out.println("Filled Array: " + Arrays.toString(newArr));

        /* 
        2. LIST METHODS (ArrayList)
         */

        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("\nList: " + list);

        list.add(1, "Go");
        System.out.println("After add(index): " + list);

        System.out.println("Get index 2: " + list.get(2));

        list.set(2, "JavaScript");
        System.out.println("After set(): " + list);

        list.remove("Java");
        System.out.println("After remove(object): " + list);

        System.out.println("Size: " + list.size());
        System.out.println("Contains Python? " + list.contains("Python"));

        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        list.clear();
        System.out.println("After clear(): " + list);

        /* 
        3. SET METHODS (HashSet)
         */

        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10); // duplicate ignored

        System.out.println("\nSet: " + set);

        set.remove(20);
        System.out.println("After remove(): " + set);

        System.out.println("Contains 10? " + set.contains(10));
        System.out.println("Size: " + set.size());
        System.out.println("Is empty? " + set.isEmpty());

        set.clear();
        System.out.println("After clear(): " + set);

        /* 
        4. MAP METHODS (HashMap)
         */

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Charlie");

        System.out.println("\nMap: " + map);

        System.out.println("Get key 2: " + map.get(2));

        map.remove(1);
        System.out.println("After remove(): " + map);

        System.out.println("Contains key 3? " + map.containsKey(3));
        System.out.println("Contains value Bob? " + map.containsValue("Bob"));

        System.out.println("Map size: " + map.size());

        System.out.println("\nIterating Map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        map.clear();
        System.out.println("After clear(): " + map);
    }
}
