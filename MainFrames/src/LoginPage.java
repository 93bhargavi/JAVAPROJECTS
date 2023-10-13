import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Login Page");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create username label and text field
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(20, 20, 80, 25);
        frame.add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(100, 20, 160, 25);
        frame.add(usernameField);

        // Create password label and password field
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(20, 50, 80, 25);
        frame.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(100, 50, 160, 25);
        frame.add(passwordField);

        // Create a login button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 80, 80, 25);
        frame.add(loginButton);

        // Create a label for displaying login status
        JLabel statusLabel = new JLabel("");
        statusLabel.setBounds(20, 110, 200, 25);
        frame.add(statusLabel);

        // Add an action listener to the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();
                String enteredPassword = new String(password);

                // Replace this with your actual login logic
                if (username.equals("yourUsername") && enteredPassword.equals("yourPassword")) {
                    statusLabel.setText("Login successful!");
                } else {
                    statusLabel.setText("Login failed. Please try again.");
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}

