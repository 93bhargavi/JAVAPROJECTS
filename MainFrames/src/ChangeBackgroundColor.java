 import java.awt.*;
import java.awt.event.*;

public class ChangeBackgroundColor extends Frame {
    private Button changeColorButton;

    public ChangeBackgroundColor() {
        setTitle("Change Background Color Example");
        setSize(400, 300);
        setLayout(new FlowLayout());

        changeColorButton = new Button("Change Color");
        changeColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeBackgroundColor();
            }
        });

        add(changeColorButton);

        setVisible(true);
    }

    private void changeBackgroundColor() {
        Color newColor = Color.RED; // Change this to the color of your choice
        setBackground(newColor);
    }

    public static void main(String[] args) {
        new ChangeBackgroundColor();
    }
}
