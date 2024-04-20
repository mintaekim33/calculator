import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functiButtons = new JButton[8];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton;

    Font myFont = new Font("Ink Free", Font.BOLD, 30);

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    public Calculator() {
        frame = new JFrame("Calculator"); // create frame for the container

        // JButton button = new JButton("Click me");
        // button.addActionListener(this);
        // label = new JLabel("Number of clicks: 0");

        // panel = new JPanel(); // create panel for the layout
        // panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        // panel.setLayout(new GridLayout(0, 1));
        // panel.add(button);
        // panel.add(label);
        // frame.add(panel, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.pack();

        frame.setSize(420, 550);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);

        frame.add(textField);

        frame.setVisible(true);

    }

    public static void main(String[] args) {
        System.out.println("Start calculator");
        Calculator calc = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}