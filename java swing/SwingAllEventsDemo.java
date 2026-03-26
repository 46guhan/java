import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class SwingAllEventsDemo extends JFrame
        implements ActionListener, ItemListener,
                   MouseListener, MouseMotionListener,
                   KeyListener, FocusListener,
                   ChangeListener {

    JButton btn;
    JTextField txt;
    JCheckBox cb;
    JLabel lbl;
    JSlider slider;

    public SwingAllEventsDemo() {

        setTitle("Swing All Events Demo");
        setSize(500, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn = new JButton("Click Me");
        txt = new JTextField();
        cb = new JCheckBox("Accept");
        lbl = new JLabel("Events Output");
        slider = new JSlider();

        btn.setBounds(50, 40, 120, 30);
        txt.setBounds(50, 90, 200, 30);
        cb.setBounds(50, 140, 100, 30);
        slider.setBounds(50, 190, 200, 50);
        lbl.setBounds(50, 260, 400, 30);

        add(btn);
        add(txt);
        add(cb);
        add(slider);
        add(lbl);

        // Register events
        btn.addActionListener(this);
        txt.addActionListener(this);

        cb.addItemListener(this);

        btn.addMouseListener(this);
        btn.addMouseMotionListener(this);

        txt.addKeyListener(this);
        txt.addFocusListener(this);

        slider.addChangeListener(this);

        setVisible(true);
    }

    /*  Action Event  */
    public void actionPerformed(ActionEvent e) {
        lbl.setText("Action Event triggered");
    }

    /*  Item Event  */
    public void itemStateChanged(ItemEvent e) {
        lbl.setText("Item Event: Checkbox changed");
    }

    /*  Mouse Events  */
    public void mouseClicked(MouseEvent e) {
        lbl.setText("Mouse Clicked");
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {
        lbl.setText("Mouse Entered Button");
    }
    public void mouseExited(MouseEvent e) {}

    public void mouseDragged(MouseEvent e) {
        lbl.setText("Mouse Dragging");
    }

    public void mouseMoved(MouseEvent e) {}

    /*  Key Events  */
    public void keyPressed(KeyEvent e) {
        lbl.setText("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    /*  Focus Events  */
    public void focusGained(FocusEvent e) {
        lbl.setText("TextField Focus Gained");
    }

    public void focusLost(FocusEvent e) {}

    /*  Change Event  */
    public void stateChanged(ChangeEvent e) {
        lbl.setText("Slider Value: " + slider.getValue());
    }

    public static void main(String[] args) {
        new SwingAllEventsDemo();
    }
}
