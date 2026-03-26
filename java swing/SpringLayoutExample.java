import javax.swing.*;
import java.awt.*;

public class SpringLayoutExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("SpringLayout Example");

        SpringLayout layout = new SpringLayout();
        frame.setLayout(layout);

        JLabel label = new JLabel("Name:");
        JTextField text = new JTextField(15);
        JButton button = new JButton("Submit");

        frame.add(label);
        frame.add(text);
        frame.add(button);

        layout.putConstraint(SpringLayout.WEST, label, 20, SpringLayout.WEST, frame);
        layout.putConstraint(SpringLayout.NORTH, label, 20, SpringLayout.NORTH, frame);

        layout.putConstraint(SpringLayout.WEST, text, 10, SpringLayout.EAST, label);
        layout.putConstraint(SpringLayout.NORTH, text, 20, SpringLayout.NORTH, frame);

        layout.putConstraint(SpringLayout.WEST, button, 20, SpringLayout.WEST, frame);
        layout.putConstraint(SpringLayout.NORTH, button, 30, SpringLayout.SOUTH, text);

        frame.setSize(400,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}