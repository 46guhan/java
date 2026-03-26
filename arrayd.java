import java.util.*;
public class arrayd {

    public static void main(String[] args) {

        // ---------- ARRAY EXAMPLES ----------
        int[] numbers = {10, 20, 30, 40, 50};

        // 1. Array length
        System.out.println("Array length: " + numbers.length);

        // 2. Access array elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        // 3. Loop through array using for loop
        System.out.println("Array elements using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 4. Enhanced for loop
        System.out.println("Array elements using enhanced for loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // 5. Sum of array elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);

        // clone(): creates a copy of the array
        int[] clonedArray = numbers.clone();
        System.out.println("Cloned array: " + Arrays.toString(clonedArray));
    }
}
