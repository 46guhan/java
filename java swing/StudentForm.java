import javax.swing.*;
import java.awt.*;

public class StudentForm {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Registration Form");
        frame.setLayout(new GridLayout(6,2,10,10));

        JLabel name = new JLabel("Name:");
        JTextField t1 = new JTextField();

        JLabel email = new JLabel("Email:");
        JTextField t2 = new JTextField();

        JLabel phone = new JLabel("Phone:");
        JTextField t3 = new JTextField();

        JLabel dept = new JLabel("Department:");
        JTextField t4 = new JTextField();

        JButton submit = new JButton("Submit");
        JButton reset = new JButton("Reset");

        frame.add(name);
        frame.add(t1);
        frame.add(email);
        frame.add(t2);
        frame.add(phone);
        frame.add(t3);
        frame.add(dept);
        frame.add(t4);
        frame.add(submit);
        frame.add(reset);

        frame.setSize(500,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}