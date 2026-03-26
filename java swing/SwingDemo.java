import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.event.*;

public class SwingDemo extends JFrame implements ActionListener {

    JTextField textField;
    JTextArea textArea;
    JCheckBox javaBox, pythonBox;
    JButton submitBtn, dialogBtn;
    JTable table;
    JList<String> list;
    JScrollBar scrollBar;

    public SwingAllComponentsDemo() {

        setTitle("Swing Components Demo");
        setSize(700,600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JLabel
        JLabel label = new JLabel("Enter Name:");
        label.setBounds(30,30,100,30);
        add(label);

        // JTextField
        textField = new JTextField();
        textField.setBounds(130,30,150,30);
        add(textField);

        // JTextArea
        textArea = new JTextArea();
        textArea.setBounds(30,80,250,60);
        add(textArea);

        // JCheckBox
        javaBox = new JCheckBox("Java");
        pythonBox = new JCheckBox("Python");

        javaBox.setBounds(30,160,80,30);
        pythonBox.setBounds(120,160,80,30);

        add(javaBox);
        add(pythonBox);

        // JButton
        submitBtn = new JButton("Submit");
        submitBtn.setBounds(30,210,100,30);
        submitBtn.addActionListener(this);
        add(submitBtn);

        // JList
        String cities[] = {"Chennai","Mumbai","Delhi","Bangalore"};
        list = new JList<>(cities);
        list.setBounds(320,30,120,80);
        add(list);

        // JTable
        String data[][] = {
                {"1","Java"},
                {"2","Python"},
                {"3","C++"}
        };
        String column[] = {"ID","Language"};

        table = new JTable(data,column);
        JScrollPane tableScroll = new JScrollPane(table);
        tableScroll.setBounds(320,130,200,100);
        add(tableScroll);

        // JScrollBar
        scrollBar = new JScrollBar();
        scrollBar.setBounds(550,30,20,200);
        add(scrollBar);

        // JTree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Courses");
        DefaultMutableTreeNode lang = new DefaultMutableTreeNode("Programming");
        lang.add(new DefaultMutableTreeNode("Java"));
        lang.add(new DefaultMutableTreeNode("Python"));
        root.add(lang);

        JTree tree = new JTree(root);
        JScrollPane treeScroll = new JScrollPane(tree);
        treeScroll.setBounds(30,260,200,150);
        add(treeScroll);

        // Button to open JDialog
        dialogBtn = new JButton("Open Dialog");
        dialogBtn.setBounds(160,210,120,30);
        dialogBtn.addActionListener(e -> openDialog());
        add(dialogBtn);

        setVisible(true);
    }

    // Action Event
    public void actionPerformed(ActionEvent e) {

        String name = textField.getText();
        String city = list.getSelectedValue();

        JOptionPane.showMessageDialog(this,
                "Name: " + name + "\nCity: " + city,
                "Information",
                JOptionPane.INFORMATION_MESSAGE);
    }

    // JDialog
    public void openDialog() {
        JDialog dialog = new JDialog(this, "Dialog Window", true);
        dialog.setSize(250,150);
        dialog.setLayout(new FlowLayout());

        dialog.add(new JLabel("This is a JDialog"));
        JButton closeBtn = new JButton("Close");
        closeBtn.addActionListener(e -> dialog.dispose());
        dialog.add(closeBtn);

        dialog.setVisible(true);
    }

    public static void main(String[] args) {
        new SwingAllComponentsDemo();
    }
}

