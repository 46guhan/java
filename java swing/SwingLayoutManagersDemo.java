import javax.swing.*;
import java.awt.*;

public class SwingLayoutManagersDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Swing Layout Managers Demo");
        frame.setSize(800, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // -----------------------------
        // 1. FlowLayout Example
        // -----------------------------
        JPanel flowPanel = new JPanel();
        flowPanel.setBorder(BorderFactory.createTitledBorder("FlowLayout"));
        flowPanel.setLayout(new FlowLayout());
        flowPanel.setBounds(20, 20, 350, 100);

        flowPanel.add(new JButton("Button 1"));
        flowPanel.add(new JButton("Button 2"));
        flowPanel.add(new JButton("Button 3"));

        // -----------------------------
        // 2. BorderLayout Example
        // -----------------------------
        JPanel borderPanel = new JPanel();
        borderPanel.setBorder(BorderFactory.createTitledBorder("BorderLayout"));
        borderPanel.setLayout(new BorderLayout());
        borderPanel.setBounds(400, 20, 350, 150);

        borderPanel.add(new JButton("North"), BorderLayout.NORTH);
        borderPanel.add(new JButton("South"), BorderLayout.SOUTH);
        borderPanel.add(new JButton("East"), BorderLayout.EAST);
        borderPanel.add(new JButton("West"), BorderLayout.WEST);
        borderPanel.add(new JButton("Center"), BorderLayout.CENTER);

        // -----------------------------
        // 3. GridLayout Example
        // -----------------------------
        JPanel gridPanel = new JPanel();
        gridPanel.setBorder(BorderFactory.createTitledBorder("GridLayout"));
        gridPanel.setLayout(new GridLayout(2, 3, 5, 5));
        gridPanel.setBounds(20, 150, 350, 100);

        for (int i = 1; i <= 6; i++) {
            gridPanel.add(new JButton("Btn " + i));
        }

        // -----------------------------
        // 4. BoxLayout Example (Vertical)
        // -----------------------------
        JPanel boxPanel = new JPanel();
        boxPanel.setBorder(BorderFactory.createTitledBorder("BoxLayout (Vertical)"));
        boxPanel.setLayout(new BoxLayout(boxPanel, BoxLayout.Y_AXIS));
        boxPanel.setBounds(400, 200, 150, 150);

        boxPanel.add(new JButton("Btn A"));
        boxPanel.add(Box.createVerticalStrut(10));
        boxPanel.add(new JButton("Btn B"));
        boxPanel.add(Box.createVerticalStrut(10));
        boxPanel.add(new JButton("Btn C"));

        // -----------------------------
        // 5. CardLayout Example
        // -----------------------------
        JPanel cardPanel = new JPanel();
        cardPanel.setBorder(BorderFactory.createTitledBorder("CardLayout"));
        CardLayout cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);
        cardPanel.setBounds(20, 270, 350, 100);

        cardPanel.add(new JButton("Card 1"), "1");
        cardPanel.add(new JButton("Card 2"), "2");
        cardPanel.add(new JButton("Card 3"), "3");

        // Timer to switch cards every 1 second
        new javax.swing.Timer(1000, e -> cardLayout.next(cardPanel)).start();

        // -----------------------------
        // Add all panels to frame
        // -----------------------------
        frame.add(flowPanel);
        frame.add(borderPanel);
        frame.add(gridPanel);
        frame.add(boxPanel);
        frame.add(cardPanel);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
