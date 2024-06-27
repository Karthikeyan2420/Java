import java.awt.*;
import java.awt.event.*;

public class AWTExample1 extends Frame implements ItemListener {
    private Choice choice;
    private TextArea textArea;
    private CheckboxGroup radioGroup;
    private Checkbox radio1, radio2;
    public AWTExample1() {
        // Set layout
        setLayout(new FlowLayout());
        // Initialize components
        choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");
        textArea = new TextArea("Text Area", 10, 30);
        radioGroup = new CheckboxGroup();
        radio1 = new Checkbox("Radio 1", radioGroup, false);
        radio2 = new Checkbox("Radio 2", radioGroup, false);
        add(choice);
        add(radio1);
        add(radio2);
        add(textArea);
        choice.addItemListener(this);
        radio1.addItemListener(this);
        radio2.addItemListener(this);
        setTitle("AWT Example");
        setSize(400, 300);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == choice) {
            String selectedItem = choice.getSelectedItem();
            textArea.append("\nChoice selected: " + selectedItem);
        }
        else if (e.getSource() == radio1 || e.getSource() == radio2) {
            String selectedRadio = ((Checkbox) e.getSource()).getLabel();
            textArea.append("\nRadio button selected: " + selectedRadio);
        }
    }
    public static void main(String[] args) {
        new AWTExample1();    }}
