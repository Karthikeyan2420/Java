// Java program to add the
// elements in the stack
import java.io.*;
import java.util.*;

class stack1 {

    // Main Method
    public static void main(String[] args)
    {
        Stack stack1 = new Stack();
        Stack<String> stack2 = new Stack<String>();

        stack1.push("4");
        stack1.push("All");
        stack1.push("12");

        stack2.push("hari");
        stack2.push("short");
        stack2.push("harish");
        stack1.pop();
        // Printing the Stack Elements
        System.out.println(stack1);
        System.out.println(stack2);
    }
}
