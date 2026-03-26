// Step 1: Create a class
class Student {

    // Variables (properties)
    String name;
    int age;

    // Method (behavior)
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

// Step 2: Main class
public class ClassObjDemo {

    public static void main(String[] args) {

        // Step 3: Create objects of the Student class
        Student s1 = new Student();
        Student s2 = new Student();

        // Step 4: Assign values to objects
        s1.name = "Rahul";
        s1.age = 20;

        s2.name = "Anitha";
        s2.age = 22;

        // Step 5: Call methods using objects
        s1.displayDetails();
        System.out.println(); // blank line
        s2.displayDetails();
    }
}
