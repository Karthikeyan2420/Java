import java.awt.*;
import java.awt.event.*;

public class AWTExample extends Frame implements ActionListener {
    private TextArea textArea;
    private Checkbox checkbox;
    private List list;

    public AWTExample() {
        // Set layout
        setLayout(new FlowLayout());

        // Initialize components
        textArea = new TextArea("Text Area", 10, 30);
        checkbox = new Checkbox("Checkbox");
        list = new List(3);

        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");

        // Add components to the frame
        add(textArea);
        add(checkbox);
        add(list);

        // Add action listener to checkbox
        checkbox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (checkbox.getState()) {
                    textArea.append("\nCheckbox is checked");
                } else {
                    textArea.append("\nCheckbox is unchecked");
                }
            }
        });

        // Add action listener to list
        list.addActionListener(this);

        // Set frame properties
        setTitle("AWT Example");
        setSize(400, 300);
        setVisible(true);

        // Add window listener to handle closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        // Get selected item from list
        String selectedItem = list.getSelectedItem();
        // Append selected item to text area
        textArea.append("\nSelected item: " + selectedItem);
    }

    public static void main(String[] args) {
        new AWTExample();
    }
}
