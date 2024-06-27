import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class swing1 extends JFrame {
    private JLabel label;
    private JTextField textField;
    private JButton button;
    private JCheckBox checkBox;
    private JTextArea textArea;

    public swing1() {
        super("Java GUI Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Create components
        label = new JLabel("Enter your name:");
        textField = new JTextField(20);
        button = new JButton("Submit");
        checkBox = new JCheckBox("Enable");
        textArea = new JTextArea(5, 20);

        // Add components to the content pane
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(label);
        container.add(textField);
        container.add(button);
        container.add(checkBox);
        container.add(new JScrollPane(textArea));

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                String message = "Hello, " + name + "!";
                textArea.append(message + "\n");

                // If checkbox is selected, display a message
                if (checkBox.isSelected()) {
                    JOptionPane.showMessageDialog(swing1.this,
                            "Checkbox is selected!", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new swing1();
            }
        });
    }
}
