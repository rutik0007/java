import javax.swing.*;
import java.awt.*;



class EventHandlingEx extends JFrame {
    private JLabel label;
    private JButton button;
    public EventHandlingEx() {
        setTitle("Event Handling Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        label = new JLabel("Click the button to see the event");
        button = new JButton("Click Me");
        button.addActionListener(e -> label.setText("Button clicked"));
        add(label);
        add(button);
    }

    public static void main(String[] args) {
        EventHandlingEx Ex = (new EventHandlingEx());
        Ex.setVisible(true);

    }
}

