import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swing2 extends JFrame {
    public swing2() {
        setTitle("Swing Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        String[][] data = {{"John", "Doe"}, {"Jane", "Doe"}, {"Alice", "Smith"}};
        String[] columnNames = {"First Name", "Last Name"};
        JTable table = new JTable(data, columnNames);
        JScrollPane tableScrollPane = new JScrollPane(table);
        panel.add(tableScrollPane);
        String[] listData = {"Option 1", "Option 2", "Option 3"};
        JList<String> list = new JList<>(listData);
        JScrollPane listScrollPane = new JScrollPane(list);
        panel.add(listScrollPane);
        add(panel);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        swing2 example = new swing2();
        example.setVisible(true);
    }
}
