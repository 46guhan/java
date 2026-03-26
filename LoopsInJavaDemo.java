public class LoopsInJavaDemo {

    public static void main(String[] args) {

        // 1. for Loop
        // Used when the number of iterations is known
        System.out.println("FOR LOOP:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println();

        // 2. while Loop
        // Used when the condition is checked before execution
        System.out.println("WHILE LOOP:");
        int j = 6;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }

        System.out.println();

        // 3. do-while Loop
        // Executes at least once, even if condition is false
        System.out.println("DO-WHILE LOOP:");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);

        System.out.println();

        // 4. for-each Loop (Enhanced for Loop)
        // Used mainly for arrays and collections
        System.out.println("FOR-EACH LOOP:");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("Number = " + num);
        }

        System.out.println();

        // 5. Nested Loop
        // Loop inside another loop
        System.out.println("NESTED LOOP:");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        System.out.println();

        // 6. break Statement
        System.out.println("BREAK STATEMENT:");
        for (int x = 1; x <= 10; x++) {
            
            if (x == 5) {
                break; // exits the loop
            }
            System.out.println("x = " + x);
        }

        System.out.println();

        // 7. continue Statement
        System.out.println("CONTINUE STATEMENT:");
        for (int y = 1; y <= 5; y++) {
            if (y == 3) {
                continue; // skips current iteration
            }
            System.out.println("y = " + y);
        }
    }
}
