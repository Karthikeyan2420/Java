import java.awt.*;

public class MenubarExample extends Frame {
    public MenubarExample() {
        setTitle("Menubar Example");
        setSize(400, 300);

        // Create a menubar
        MenuBar menuBar = new MenuBar();
        setMenuBar(menuBar); // Set the menubar for the frame

        // Create menus and menu items
        Menu fileMenu = new Menu("File");
        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open");
        MenuItem exitItem = new MenuItem("Exit");
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);

        // Set layout to null for absolute positioning
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MenubarExample();
    }
}
