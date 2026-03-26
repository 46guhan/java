// types of variables
// 1. Local Variables
// 2. Instance Variables
// 3. Static Variables

public class VariablesTypesDemo {

    // Instance Variables
    // Declared inside a class but outside any method
    // Each object gets its own copy
    String studentName;   // instance variable
    int studentAge;       // instance variable

    // Static Variable
    // Declared using the static keyword
    // Shared among all objects of the class
    static String collegeName = "ABC Institute";

    // Constructor to initialize instance variables
    VariablesTypesDemo(String name, int age) {
        studentName = name;
        studentAge = age;
    }

    // Method demonstrating Local Variables
    void displayDetails() {
        // Local Variables
        // Declared inside a method
        // Accessible only within this method
        int year = 2026;           // local variable
        String course = "Java";   // local variable

        System.out.println("Student Name   : " + studentName);
        System.out.println("Student Age    : " + studentAge);
        System.out.println("Course         : " + course);
        System.out.println("Year           : " + year);
        System.out.println("College Name   : " + collegeName);
        System.out.println("------------------------------");
    }

    // Main Method
    public static void main(String[] args) {

        // Creating first object
        VariablesTypesDemo student1 = new VariablesTypesDemo("gokul", 21);
        student1.displayDetails();

        // Creating second object
        VariablesTypesDemo student2 = new VariablesTypesDemo("rahul", 22);
        student2.displayDetails();

        // Accessing static variable using class name
        System.out.println("College (Static Variable): " + VariablesTypesDemo.collegeName);
    }
}

