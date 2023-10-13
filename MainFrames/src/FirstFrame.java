import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstFrame {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("My First Java Frame");

        // Create a JButton (button)
        JButton button = new JButton("Click Me!");

        // Add the button to the frame
        frame.add(button);

        // Set the frame size
        frame.setSize(300, 200);

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}
