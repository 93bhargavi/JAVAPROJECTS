 import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class StoringInFrame{
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

        // Add an ActionListener to the "Clear" button
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clear the text fields
                firstNameField.setText("");
                lastNameField.setText("");
            }
        });

        // Add an ActionListener to the "OK" button
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the values from the text fields
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();

                // Store the details in a file (e.g., details.txt)
                try (FileWriter writer = new FileWriter("Details.txt", true)) {
                    writer.write("First Name: " + firstName + " Last Name: " + lastName + "\n");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
