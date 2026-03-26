public class DataTypesDemo {

    public static void main(String[] args) {

        // 1. Primitive Data Types
        byte b = 100;
        short s = 20000;
        int i = 100000;
        long l = 1234567890L;

        float f = 10.5f;
        double d = 99.99;

        char c = 'A';
        boolean isJavaFun = true;

        // Display Primitive Data Types
        System.out.println("Primitive Data Types:");
        System.out.println("byte value: " + b);
        System.out.println("short value: " + s);
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
        System.out.println("double value: " + d);
        System.out.println("char value: " + c);
        System.out.println("boolean value: " + isJavaFun);

        System.out.println("\n------------------------\n");

        // 2. Non-Primitive Data Types
        String name = "Java";
        int[] numbers = {10, 20, 30};

        System.out.println("Non-Primitive Data Types:");
        System.out.println("String value: " + name);
        System.out.println("Array values:"+ numbers);

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
