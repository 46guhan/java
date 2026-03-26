public class FunctionsInJavaDemo {

    // 1. Function with No Return Type and No Parameters
    static void greet() {
        System.out.println("Hello! Welcome to Java Functions.");
    }

    // 2. Function with Parameters and No Return Type
    static void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }

    // 3. Function with Return Type and Parameters
    static int multiply(int x, int y) {
        return x * y;
    }

    // 4. Function with Return Type and No Parameters
    static int getNumber() {
        return 100;
    }

    // 5. Non-static Function (Instance Method)
    void displayMessage() {
        System.out.println("This is a non-static function.");
    }

    // Main Method
    public static void main(String[] args) {

        // Calling function with no parameters and no return type
        greet();

        // Calling function with parameters
        add(10, 20);

        // Calling function with return type
        int result = multiply(5, 4);
        System.out.println("Multiplication Result = " + result);

        // Calling function with return type and no parameters
        int num = getNumber();
        System.out.println("Returned Number = " + num);

        // Calling non-static function using object
        FunctionsInJavaDemo obj = new FunctionsInJavaDemo();
        obj.displayMessage();
    }
}
