 import javax.swing.*;
import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

public class calculator extends JFrame {
    private JTextField display;
    private JButton[] numberButtons;
    private JButton addButton, subtractButton, multiplyButton, divideButton, equalsButton, clearButton, percentageButton;
    private double firstNumber, secondNumber;
    private String operator;

    public calculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
        }

        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        equalsButton = new JButton("=");
        clearButton = new JButton("C");
        percentageButton = new JButton("%");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4));

        for (int i = 7; i <= 9; i++) {
            buttonPanel.add(numberButtons[i]);
        }
        buttonPanel.add(addButton);

        for (int i = 4; i <= 6; i++) {
            buttonPanel.add(numberButtons[i]);
        }
        buttonPanel.add(subtractButton);

        for (int i = 1; i <= 3; i++) {
            buttonPanel.add(numberButtons[i]);
        }
        buttonPanel.add(multiplyButton);

        buttonPanel.add(numberButtons[0]);
        buttonPanel.add(clearButton);
        buttonPanel.add(equalsButton);
        buttonPanel.add(divideButton);
        buttonPanel.add(percentageButton);

        add(buttonPanel, BorderLayout.CENTER);

        for (int i = 0; i < 10; i++) {
            final int num = i;
            numberButtons[i].addActionListener(e -> appendToDisplay(num));
        }
        addButton.addActionListener(e -> setOperator("+"));
        subtractButton.addActionListener(e -> setOperator("-"));
        multiplyButton.addActionListener(e -> setOperator("*"));
        divideButton.addActionListener(e -> setOperator("/"));
        percentageButton.addActionListener(e -> setOperator("%"));
        equalsButton.addActionListener(e -> calculate());
        clearButton.addActionListener(e -> clear());

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void appendToDisplay(int num) {
        display.setText(display.getText() + num);
    }

    private void setOperator(String op) {
        firstNumber = Double.parseDouble(display.getText());
        operator = op;
        display.setText("");
    }

    private void calculate() {
        secondNumber = Double.parseDouble(display.getText());
        double result = 0.0;

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    display.setText("Error");
                    return;
                }
                break;
            case "%":
                result = firstNumber * (secondNumber / 100);
                break;
        }

        display.setText(String.valueOf(result));
    }

    private void clear() {
        display.setText("");
        firstNumber = 0;
        secondNumber = 0;
        operator = null;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new calculator());
    }
}
