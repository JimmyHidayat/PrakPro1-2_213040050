import java.awt.event.*;
import javax.swing.*;

public class HelloTextArea extends JFrame {
    public HelloTextArea() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelInput = new JLabel("Input Name: ");
        labelInput.setBounds(130, 40, 100, 10);

        JTextField textField = new JTextField();
        textField.setBounds(130, 60, 100, 30);

        JButton button = new JButton("Click");
        button.setBounds(130, 100, 100, 40);

        JTextArea textOutput = new JTextArea("");
        textOutput.setBounds(130, 150, 100, 100);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                textOutput.append("Hello" + name + "\n");
                textField.setText("name");
            }
        });
        this.add(textOutput);
        this.add(textField);
        this.add(button);
        this.add(labelInput);

        this.setSize(400, 500);
        this.setLayout(null);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloTextArea h = new HelloTextArea();
                h.setVisible(true);
            }
        });
    }
}