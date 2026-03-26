class Person {

    String name;

    Person(String name) {
        this.name = name;
        System.out.println("Parent Constructor Called");
    }

    void show() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {

    int salary;

    Employee(String name, int salary) {
        super(name);   // calling parent constructor
        this.salary = salary;
    }

    void show() {
        super.show();  // calling parent method
        System.out.println("Salary: " + salary);
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {

        Employee emp = new Employee("Ravi", 50000);
        emp.show();
    }
}
