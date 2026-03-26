class Person {

    protected String name;
    protected int age;

    // Parent constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor executed");
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {

    private int rollNo;
    private String course;

    // Child constructor using super()
    Student(String name, int age, int rollNo, String course) {

        super(name, age);  // calling parent constructor

        this.rollNo = rollNo;
        this.course = course;

        System.out.println("Student constructor executed");
    }

    // Method overriding
    @Override
    void displayDetails() {
        super.displayDetails();  // call parent method
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

public class Constructor {

    public static void main(String[] args) {

        Student s1 = new Student("Arun", 21, 101, "Computer Science");

        System.out.println("\n--- Student Details ---");
        s1.displayDetails();
    }
}
