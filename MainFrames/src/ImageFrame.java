import javax.swing.*;
import java.awt.*;

public class ImageFrame extends JFrame {

    public ImageFrame() {
        setTitle("Image on JFrame Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel to hold the image
        JPanel imagePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Load the image from a file
                ImageIcon imageIcon = new ImageIcon("your_image_file.png");
                // Draw the image on the panel
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, this);
            }
        };

        // Add the imagePanel to the JFrame
        add(imagePanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ImageFrame frame = new ImageFrame();
            frame.setVisible(true);
        });
    }
}
