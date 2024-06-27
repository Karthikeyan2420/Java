import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {

        Frame f = new Frame("Text Field Example");


        Label l1;
        l1 = new Label("Enter text:");
        l1.setBounds(50, 50, 100, 30); // Setting the position of the label


        TextField t1 = new TextField();
        t1.setBounds(50, 100, 200, 30); // Setting the position of the text field


        f.add(l1);
        f.add(t1);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);


        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }
}  
