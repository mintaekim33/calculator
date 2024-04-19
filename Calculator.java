import java.awt.*;
import javax.swing.*;

public class Calculator {

    public Calculator() {
        JFrame frame = new JFrame(); // create frame for the container

        JPanel panel = new JPanel(); // create panel for the layout
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));

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
}