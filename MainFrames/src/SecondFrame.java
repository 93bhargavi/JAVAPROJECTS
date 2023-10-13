import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SecondFrame {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Name Form");

        // Create a JPanel to hold components
        JPanel panel = new JPanel();

        // Create labels for first name and last name
        JLabel firstNameLabel = new JLabel("First Name:");
        JLabel lastNameLabel = new JLabel("Last Name:");

        // Create text fields for first name and last name
        JTextField firstNameField = new JTextField(20);
        JTextField lastNameField = new JTextField(20);

        // Create "Clear" and "OK" buttons
        JButton clearButton = new JButton("Clear");
        JButton okButton = new JButton("OK");

        // Add components to the panel
        panel.add(firstNameLabel);
        panel.add(firstNameField);
        panel.add(lastNameLabel);
        panel.add(lastNameField);
        panel.add(clearButton);
        panel.add(okButton);

        // Add the panel to the frame
        frame.add(panel);

        // Set the frame size
        frame.setSize(300, 150);

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}

