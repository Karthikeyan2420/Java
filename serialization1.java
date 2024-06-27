import java.io.*;

// Class to be serialized
class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class serialization1 {
    public static void main(String[] args) {
        // Serialization
        try {
            // Creating an object of Student
            Student student = new Student("Alice", 20);

            // Writing the object to file
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(student);
            out.close();
            fileOut.close();
            System.out.println("Student object has been serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try {
            // Reading the object from file
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Student student = (Student) in.readObject();
            in.close();
            fileIn.close();

            // Displaying the deserialized object's details
            System.out.println("Student object has been deserialized");
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
