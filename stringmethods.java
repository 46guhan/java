public class stringmethods {

    public static void main(String[] args) {

        // Creating strings
        String str1 = "Hello World";
        String str2 = "Java Programming";
        String str3 = "  Welcome to Java  ";

        // 1. length()
        System.out.println("Length of str1: " + str1.length());

        // 2. charAt()
        System.out.println("Character at index 1: " + str1.charAt(1));

        // 3. toUpperCase()
        System.out.println("Uppercase: " + str1.toUpperCase());

        // 4. toLowerCase()
        System.out.println("Lowercase: " + str1.toLowerCase());

        // 5. equals()
        System.out.println("Equals 'Hello World': " + str1.equals("Hello World"));

        // 6. equalsIgnoreCase()
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase("hello world"));

        // 7. compareTo()
        System.out.println("Compare str1 and str2: " + str1.compareTo(str2));

        // 8. concat()
        System.out.println("Concatenation: " + str1.concat(" - Java"));

        // 9. contains()
        System.out.println("Contains 'World': " + str1.contains("World"));

        // 10. startsWith()
        System.out.println("Starts with 'Hello': " + str1.startsWith("Hello"));

        // 11. endsWith()
        System.out.println("Ends with 'World': " + str1.endsWith("World"));

        // 12. indexOf()
        System.out.println("Index of 'o': " + str1.indexOf('o'));

        // 13. lastIndexOf()
        System.out.println("Last index of 'o': " + str1.lastIndexOf('o'));

        // 14. replace()
        System.out.println("Replace 'World' with 'Java': " + str1.replace("World", "Java"));

        // 15. substring()
        System.out.println("Substring from index 6: " + str1.substring(6));

        // 16. substring(begin, end)
        System.out.println("Substring (0,5): " + str1.substring(0, 5));

        // 17. trim()
        System.out.println("Trimmed string: '" + str3.trim() + "'");

        // 18. isEmpty()
        String emptyStr = "";
        System.out.println("Is empty: " + emptyStr.isEmpty());

        // 19. split()
        String[] words = str2.split(" "); // {"java","programming"}
        System.out.println("Split words:");
        for (String word : words) {
            System.out.println(word);
        }

        // 20. valueOf()
        String nu = "100";
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("String value of number: " + numStr);

        // 21. toCharArray()
        char[] chars = str1.toCharArray(); //{"h","e","l"}
        System.out.println("Characters in string:");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 22. replaceAll()
        System.out.println("Replace vowels: " + str1.replaceAll("[AEIOUaeiou]", "*"));

        // 23. matches()
        System.out.println("Matches regex 'Hello.*': " + str1.matches("Hello.*"));

        String name = "gokul";
        int age = 22;
        float age2 = 22.5f;
        System.out.printf("hi i am %s and %d years old and float = %f\n", name, age, age2);

        String fun = String.format("hi i am %s and %d years old and float = %f", name, age, age2);
        System.out.println(fun);
    }
}
