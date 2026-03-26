import javax.swing.*;
import java.awt.event.*;

public class JavaSwing {

    public static void main(String[] args) {

        /*
         WHAT IS JAVA SWING?
         ------------------
         Swing is a part of Java Foundation Classes (JFC).
         It is used to create desktop-based GUI applications.
         Swing components are lightweight and platform independent.
        */

        // JFrame – Main Window
        JFrame frame = new JFrame("Java Swing Explanation");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // JLabel – Display Text
        JLabel lblTitle = new JLabel("Welcome to Java Swing");
        lblTitle.setBounds(150, 20, 200, 25);
        frame.add(lblTitle);

        // JTextField – Input Field
        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(50, 70, 100, 25);
        frame.add(lblName);

        JTextField txtName = new JTextField();
        txtName.setBounds(150, 70, 200, 25);
        frame.add(txtName);

        // JCheckBox – Multiple Selection
        JCheckBox chkJava = new JCheckBox("Java");
        chkJava.setBounds(50, 110, 100, 25);

        JCheckBox chkPython = new JCheckBox("Python");
        chkPython.setBounds(160, 110, 100, 25);

        frame.add(chkJava);
        frame.add(chkPython);

        // JRadioButton – Single Selection
        JLabel lblGender = new JLabel("Gender:");
        lblGender.setBounds(50, 150, 100, 25);
        frame.add(lblGender);

        JRadioButton rbMale = new JRadioButton("Male");
        rbMale.setBounds(150, 150, 80, 25);

        JRadioButton rbFemale = new JRadioButton("Female");
        rbFemale.setBounds(240, 150, 100, 25);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rbMale);
        genderGroup.add(rbFemale);

        frame.add(rbMale);
        frame.add(rbFemale);

        // JComboBox – Dropdown
        JLabel lblCourse = new JLabel("Course:");
        lblCourse.setBounds(50, 190, 100, 25);
        frame.add(lblCourse);

        String[] courses = {"Select", "Java", "Python", "C++", "Web Development"};
        JComboBox<String> comboCourse = new JComboBox<>(courses);
        comboCourse.setBounds(150, 190, 200, 25);
        frame.add(comboCourse);

        // JButton – Click Button
        JButton btnClick = new JButton("Submit");
        btnClick.setBounds(180, 240, 100, 30);
        frame.add(btnClick);

        // Event Handling in Swing
        btnClick.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                String gender = rbMale.isSelected() ? "Male" : rbFemale.isSelected() ? "Female" : "Not Selected";
                StringBuilder skills = new StringBuilder();
                if (chkJava.isSelected()) skills.append("Java ");
                if (chkPython.isSelected()) skills.append("Python ");
                String course = comboCourse.getSelectedItem().toString();

                JOptionPane.showMessageDialog(frame,
                        "Name: " + name + "\nGender: " + gender + "\nSkills: " + skills + "\nCourse: " + course);
            }
        });

        // Display the Frame
        frame.setVisible(true);
    }
}
