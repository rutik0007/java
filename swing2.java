import javax.swing.*;
import java.awt.*;

public class swing2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing  Grid Example");
        frame.setLayout(new GridLayout(1,2));

        JButton button1 = new JButton("Click Mee");
        JButton button2 = new JButton("Click Me");

        frame.add(button1);
        frame.add(button2);

        frame.setSize(300,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
