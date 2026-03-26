import java.util.*;

public class UtilPackageDemo {

    public static void main(String[] args) {

        /* 
         * 1. Scanner Class
         * Used to take input from user
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);

        /* 
         * 2. List Interface (ArrayList)
         * List allows duplicate elements and maintains insertion order
         */
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // duplicates allowed

        System.out.println("\nList (ArrayList) elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        /* 
         * 3. Set Interface (HashSet)
         * Set does NOT allow duplicate elements
         */
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10); // duplicate ignored

        System.out.println("\nSet (HashSet) elements:");
        for (int num : numbers) {
            System.out.println(num);
        }

        /* 
         * 4. Map Interface (HashMap)
         * Stores data in key-value pairs
         */
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Rahul");
        students.put(2, "Anita");
        students.put(3, "Karan");

        System.out.println("\nMap (HashMap) elements:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        /* 
         * 5. Random Class
         * Used to generate random numbers
         */
        Random random = new Random();
        int randomNumber = random.nextInt(100); // 0 to 99
        System.out.println("\nRandom number: " + randomNumber);

        /* 
         * 6. Arrays Utility Class
         * Provides utility methods for arrays
         */
        int[] arr = {5, 2, 8, 1, 3};
        Arrays.sort(arr);

        System.out.println("\nSorted Array:");
        System.out.println(Arrays.toString(arr));

        /* 
         * 7. Collections Utility Class
         * Provides utility methods for collections
         */
        Collections.sort(fruits);
        System.out.println("\nSorted List using Collections:");
        System.out.println(fruits);

        /* 
         * 8. Date Class
         * Represents current date and time
         */
        Date date = new Date();
        System.out.println("\nCurrent Date and Time:");
        System.out.println(date);

        sc.close();
    }
}
