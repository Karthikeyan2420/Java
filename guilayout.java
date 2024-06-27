//import javax.swing.*;
//import java.awt.*;
//public class guilayout {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("FlowLayout Example");
//        frame.setLayout(new FlowLayout());
//        frame.add(new JButton("Button 1"));
//        frame.add(new JButton("Button 2"));
//        frame.add(new JButton("Button 3"));
//        frame.pack();
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//}

//import javax.swing.*;
//import java.awt.*;
//public class guilayout {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("BorderLayout Example");
//        frame.setLayout(new BorderLayout());
//        frame.add(new JButton("North"), BorderLayout.NORTH);
//        frame.add(new JButton("South"), BorderLayout.SOUTH);
//        frame.add(new JButton("East"), BorderLayout.EAST);
//        frame.add(new JButton("West"), BorderLayout.WEST);
//        frame.add(new JButton("Center"), BorderLayout.CENTER);
//        frame.pack();
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//}


import javax.swing.*;
import java.awt.*;
public class guilayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Example");
        frame.setLayout(new GridLayout(3, 3));
        for (int i = 1; i <= 9; i++) {
            frame.add(new JButton("Button " + i));
        }
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CardLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout Example");
        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);
        JButton button1 = new JButton("Card 1");
        JButton button2 = new JButton("Card 2");
        JButton button3 = new JButton("Card 3");
        cardPanel.add(button1, "Card 1");
        cardPanel.add(button2, "Card 2");
        cardPanel.add(button3, "Card 3");
        frame.add(cardPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1.addActionListener(e -> cardLayout.show(cardPanel, "Card 2"));
        button2.addActionListener(e -> cardLayout.show(cardPanel, "Card 3"));
        button3.addActionListener(e -> cardLayout.show(cardPanel, "Card 1"));
    }
}  */

/*import java.awt.*;
import javax.swing.*;

public class BoxLayoutExample1 extends Frame {
 Button buttons[];

 public BoxLayoutExample1 () {
   buttons = new Button [5];

   for (int i = 0;i<5;i++) {
      buttons[i] = new Button ("Button " + (i + 1));
      // adding the buttons so that it can be displayed
      add (buttons[i]);
    }
  // the buttons will be placed horizontally
setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));
setSize(400,400);
setVisible(true);
}
  // main method
public static void main(String args[]){
BoxLayoutExample1 b=new BoxLayoutExample1();
}
}    */


/*
* // Importing the different Packages.
import javax.swing.*;
import java.awt.*;
// the MySpringDemo1 class
public class MySpringDemo1
{
// main method
public static void main(String argvs[])
{
// the main window
// Method for setting the default look and feel
// decorated status of the JFrame.
JFrame.setDefaultLookAndFeelDecorated(true);
// Creating an object of the "JFrame" class
JFrame f = new JFrame("Spring Layout Example");
// Function to set the default
// close operation status of JFrame
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// method to determine the
// size status of the JFrame
f.setSize(310, 210);
// to get the content pane
Container cntt = f.getContentPane();
// Creating Object of "SpringLayout" class
SpringLayout sprLayout = new SpringLayout();
// for setting the layout class
f.setLayout(sprLayout);
// Initializing the object
// "btn1" of the JButton class.
Component btn1 = new JButton("C++");
// Initializing the object
// "btn2" of the JButton class.
Component btn2 = new JButton("Python");
// Initializing the object
// "btn3" the JButton class.
Component btn3 = new JButton("JAVA");
// Initializing the object
// "btn4" of the JButton class.
Component btn4 = new JButton("NETWORKING");
// Adding the JButton "btn1" on the frame f
f.add(btn1);
// Adding the JButton "btn2" on the frame f
f.add(btn2);
// Adding the JButton "btn3" on the frame f
f.add(btn3);
// Adding the JButton "btn4" on the frame f
f.add(btn4);
// It is used for inserting the
// layout constraint in the JFrame by using
// the springLayout class on the btn1 JButton
sprLayout.putConstraint(SpringLayout.WEST, btn1,
24, SpringLayout.WEST, cntt);

sprLayout.putConstraint(SpringLayout.NORTH, btn1,
    9, SpringLayout.NORTH, cntt);
// It is used for inserting the
// layout constraint in the JFrame using
// the springLayout class on the btn2 JButton
sprLayout.putConstraint(SpringLayout.WEST, btn2,
49, SpringLayout.WEST, cntt);
sprLayout.putConstraint(SpringLayout.NORTH, btn2,
        10, SpringLayout.SOUTH, btn1);
// It is used for inserting the
// layout constraint in the JFrame using
// springLayout class on the btn3 JButton
sprLayout.putConstraint(SpringLayout.WEST, btn3,
74, SpringLayout.WEST, cntt);

sprLayout.putConstraint(SpringLayout.NORTH, btn3,
        9, SpringLayout.SOUTH, btn2);
// It is used for inserting the
// layout constraint in the JFrame using
// sprLayout class on the btn4 JButton
sprLayout.putConstraint(SpringLayout.WEST, btn4,
        14, SpringLayout.EAST, btn1);
sprLayout.putConstraint(SpringLayout.NORTH, btn4,
    9, SpringLayout.NORTH, cntt);
// method for setting the
// visibility status of the JFrame
f.setVisible(true);
}
}  */