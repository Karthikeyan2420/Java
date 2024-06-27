// Java program to change elements
// in a LinkedList

import java.util.*;

public class LinkedList1 {

    public static void main(String args[])
    {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("abc");
        ll.add("df");
        ll.add(1, "hj");

        System.out.println("Initial LinkedList " + ll);

        ll.set(1, "For");

        System.out.println("Updated LinkedList " + ll);
        ll.remove("For");
        System.out.println(ll);
    }
}
