import java.io.*;

public class FileHandling {

    // Method to write data to a file
    public static void writeFile(String fileName, String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(data);
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    // Method to read data from a file
    public static void readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    // Method to append data to a file
    public static void appendFile(String fileName, String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(data);
            System.out.println("Data appended to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }

    // Method to delete a file
    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    public static void main(String[] args) {
        String fileName = "example.txt";
        String data = "This is some example data.\n";

        // Write data to file
        writeFile(fileName, data);

        // Read data from file
        System.out.println("Reading data from file:");
        readFile(fileName);

        // Append data to file
        String additionalData = "This is some additional data.\n";
        appendFile(fileName, additionalData);

        // Read data again to verify append
        System.out.println("Reading data from file after append:");
        readFile(fileName);

       deleteFile(fileName);
    }
}
