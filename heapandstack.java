public class heapandstack {

    // Heap memory example: instance variable
    private int instanceVariable;

    // Heap memory example: reference variable
    private String instanceString;

    public heapandstack(int value, String text) {
        // Stack memory example: local variables
        int localValue = value;
        String localText = text;

        // Assigning local variables to instance variables (stored in heap)
        this.instanceVariable = localValue;
        this.instanceString = localText;
    }

    public int getInstanceVariable() {
        return instanceVariable;
    }

    public String getInstanceString() {
        return instanceString;
    }

    public static void main(String[] args) {
        // Stack memory example: local variables in main method
        int a = 10;
        String str = "Hello, Heap and Stack!";

        // Creating an object of MemoryExample (allocated in heap memory)
        heapandstack example = new heapandstack(a, str);

        // Accessing instance variables (heap memory)
        System.out.println("Instance Variable: " + example.getInstanceVariable());
        System.out.println("Instance String: " + example.getInstanceString());

        // Stack memory example: another method call
        printLocalVariables(a, str);
    }

    public static void printLocalVariables(int num, String text) {
        // Stack memory example: local variables in a method
        System.out.println("Local Number: " + num);
        System.out.println("Local Text: " + text);
    }
}
