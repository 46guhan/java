import java.awt.*;
import java.awt.event.*;

public class EventHandlingControls extends Frame
        implements ActionListener, ItemListener {

    // Controls
    Label lblName, lblResult;
    TextField txtName;
    Button btnClick, btnClear;
    Checkbox cbJava;

    public EventHandlingControls() {

        // Frame settings
        setTitle("Event Handling Controls Demo");
        setSize(400, 300);
        setLayout(null); // using setBounds

        // Create controls
        lblName = new Label("Enter Name:");
        txtName = new TextField();

        cbJava = new Checkbox("I like Java");

        btnClick = new Button("Submit");
        btnClear = new Button("Clear");

        lblResult = new Label("");

        // Set positions
        lblName.setBounds(50, 60, 80, 25);
        txtName.setBounds(140, 60, 180, 25);

        cbJava.setBounds(140, 100, 120, 25);

        btnClick.setBounds(140, 140, 80, 30);
        btnClear.setBounds(240, 140, 80, 30);

        lblResult.setBounds(50, 190, 300, 30);

        // Add controls
        add(lblName);
        add(txtName);
        add(cbJava);
        add(btnClick);
        add(btnClear);
        add(lblResult);

        // Register events (IMPORTANT)
        btnClick.addActionListener(this);
        btnClear.addActionListener(this);
        cbJava.addItemListener(this);

        // Window closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    /* Button Events */
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnClick) {
            lblResult.setText("Hello " + txtName.getText());
        }

        if (e.getSource() == btnClear) {
            txtName.setText("");
            lblResult.setText("");
            cbJava.setState(false);
        }
    }

    /* Checkbox Event */
    public void itemStateChanged(ItemEvent e) {

        if (cbJava.getState()) {
            lblResult.setText("You selected Java");
        } else {
            lblResult.setText("Java unchecked");
        }
    }

    public static void main(String[] args) {
        new EventHandlingControls();
    }
}
