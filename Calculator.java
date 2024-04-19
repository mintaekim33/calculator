import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    public Calculator() {
        frame = new JFrame(); // create frame for the container

        JButton button = new JButton("Click me");
        button.addActionListener(this);
        label = new JLabel("Number of clicks: 0");

        panel = new JPanel(); // create panel for the layout
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our Calculator");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        System.out.println("Start calculator");
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}