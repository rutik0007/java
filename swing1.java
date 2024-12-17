import javax.swing.*;
import java.awt.event.ActionListener;


public class swing1 {
    public static void main(String[] args) {
        JFrame frame =new JFrame("Swing Example");
        JTextField textfield=new JTextField(10);
        JButton button=new JButton("Click Me");

        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, textfield.getText()));
        frame.add(textfield);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.FlowLayout());
        frame.setSize(400,300);
        frame.setVisible(true);
    }
}
