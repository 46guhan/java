import java.io.*;

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializationDemo {

    public static void main(String[] args) {

        // SERIALIZATION
        try {
            Student s1 = new Student(101, "rahul");

            FileOutputStream fos = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1);
            oos.close();
            fos.close();

            System.out.println("Object Serialized");

        } catch (Exception e) {
            e.printStackTrace();
        }

        // DESERIALIZATION
        try {
            FileInputStream fis = new FileInputStream("student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s2 = (Student) ois.readObject();
            ois.close();
            fis.close();

            System.out.println("Object Deserialized");
            System.out.println("ID: " + s2.id);
            System.out.println("Name: " + s2.name);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
