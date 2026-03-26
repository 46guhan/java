// Base (Parent) Class
class Person {
    void eat() {
        System.out.println("Person eats food");
    }
}

// 1. Single Inheritance
class Student extends Person {
    void study() {
        System.out.println("Student studies");
    }
}

// 2. Multilevel Inheritance
class CollegeStudent extends Student {
    void attendClass() {
        System.out.println("College student attends class");
    }
}

// 3. Hierarchical Inheritance
class Employee extends Person {
    void work() {
        System.out.println("Employee works");
    }
}

// Main Class
public class InheritanceAndTypesDemo {

    public static void main(String[] args) {

        System.out.println("--- Single Inheritance ---");
        Student s = new Student();
        s.eat();
        s.study();

        System.out.println();

        System.out.println("--- Multilevel Inheritance ---");
        CollegeStudent cs = new CollegeStudent();
        cs.eat();
        cs.study();
        cs.attendClass();

        System.out.println();

        System.out.println("--- Hierarchical Inheritance ---");
        Employee e = new Employee();
        e.eat();
        e.work();
    }
}
