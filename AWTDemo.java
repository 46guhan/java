import java.awt.*;
import java.awt.event.*;

public class AWTDemo extends Frame implements ActionListener {

    Label nameLabel, genderLabel, langLabel, courseLabel, outputLabel;
    TextField nameField;
    TextArea addressArea;
    Checkbox javaBox, pythonBox, cppBox;
    Checkbox maleRadio, femaleRadio;
    CheckboxGroup genderGroup;
    List cityList;
    Choice courseChoice;
    Button submitBtn;
    Scrollbar scrollBar;

    public AWTDemo() {

        setTitle("AWT Components Demo");
        setSize(400, 500);
        setLayout(null);

        // Label
        nameLabel = new Label("Name:");
        nameLabel.setBounds(50, 60, 100, 30);
        add(nameLabel);

        // TextField
        nameField = new TextField();
        nameField.setBounds(150, 60, 200, 30);
        add(nameField);

        // TextArea
        Label addressLabel = new Label("Address:");
        addressLabel.setBounds(50, 100, 100, 30);
        add(addressLabel);

        addressArea = new TextArea();
        addressArea.setBounds(150, 100, 200, 60);
        add(addressArea);

        // Radio Buttons (CheckboxGroup)
        genderLabel = new Label("Gender:");
        genderLabel.setBounds(50, 180, 100, 30);
        add(genderLabel);

        genderGroup = new CheckboxGroup();
        maleRadio = new Checkbox("Male", genderGroup, false);
        femaleRadio = new Checkbox("Female", genderGroup, false);

        maleRadio.setBounds(150, 180, 70, 30);
        femaleRadio.setBounds(230, 180, 80, 30);

        add(maleRadio);
        add(femaleRadio);

        // Checkboxes
        langLabel = new Label("Languages:");
        langLabel.setBounds(50, 220, 100, 30);
        add(langLabel);

        javaBox = new Checkbox("Java");
        pythonBox = new Checkbox("Python");
        cppBox = new Checkbox("C++");

        javaBox.setBounds(150, 220, 70, 30);
        pythonBox.setBounds(220, 220, 80, 30);
        cppBox.setBounds(300, 220, 70, 30);

        add(javaBox);
        add(pythonBox);
        add(cppBox);

        // List
        Label cityLabel = new Label("City:");
        cityLabel.setBounds(50, 260, 100, 30);
        add(cityLabel);

        cityList = new List();
        cityList.setBounds(150, 260, 120, 60);

        cityList.add("Chennai");
        cityList.add("Mumbai");
        cityList.add("Delhi");
        cityList.add("Bangalore");

        add(cityList);

        // Choice
        courseLabel = new Label("Course:");
        courseLabel.setBounds(50, 330, 100, 30);
        add(courseLabel);

        courseChoice = new Choice();
        courseChoice.setBounds(150, 330, 120, 30);

        courseChoice.add("BCA");
        courseChoice.add("BSc");
        courseChoice.add("MCA");
        courseChoice.add("MSc");

        add(courseChoice);

        // Scrollbar
        scrollBar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 100);
        scrollBar.setBounds(100, 380, 200, 30);
        add(scrollBar);

        // Button
        submitBtn = new Button("Submit");
        submitBtn.setBounds(150, 430, 100, 40);
        submitBtn.addActionListener(this);
        add(submitBtn);

        // Output Label
        outputLabel = new Label("");
        outputLabel.setBounds(50, 480, 400, 30);
        add(outputLabel);

        // MenuBar
        MenuBar mb = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem exitItem = new MenuItem("Exit");

        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(exitItem);
        mb.add(fileMenu);

        setMenuBar(mb);

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    // Action Event
    public void actionPerformed(ActionEvent e) {

        String name = nameField.getText();
        String gender = genderGroup.getSelectedCheckbox().getLabel();
        String city = cityList.getSelectedItem();
        String course = courseChoice.getSelectedItem();

        outputLabel.setText("Hello " + name + " | " + gender + " | " + city + " | " + course);
    }

    public static void main(String[] args) {
        new AWTDemo();
    }
}

