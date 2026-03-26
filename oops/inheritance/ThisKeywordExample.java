class Student {

    String name;
    int age;

    // Constructor using this keyword
    Student(String name, int age) {
        this.name = name;   // current object variable
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void show() {
        this.display();   // calling current class method
    }
}

public class ThisKeywordExample {
    public static void main(String[] args) {

        Student s1 = new Student("Arun", 20);
        s1.show();
    }
}
