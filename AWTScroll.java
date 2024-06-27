import java.awt.*;

public class AWTScroll extends Frame {

    public AWTScroll() {
        setTitle("Scrollbar Example");
        setSize(400, 300);

        // Create a vertical scrollbar
        Scrollbar scrollbar = new Scrollbar(Scrollbar.VERTICAL);
        scrollbar.setBounds(50, 50, 20, 100); // Set position and size
        add(scrollbar); // Add scrollbar to the frame

        setLayout(null); // Set layout to null for absolute positioning
        setVisible(true);
    }

    public static void main(String[] args) {
        new AWTScroll();
    }
}
