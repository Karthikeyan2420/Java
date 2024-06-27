import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();


        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("ArrayList elements: " + list);

        list.add(1, "E");

        System.out.println("After adding 'E' at index 1: " + list);

        list.remove(2);

        System.out.println("After removing element at index 2: " + list);

        list.remove("A");

        System.out.println("After removing element 'A': " + list);

        String elementAtIndex1 = list.get(1);
        System.out.println("Element at index 1: " + elementAtIndex1);

        list.set(0, "F");

        System.out.println("After replacing element at index 0 with 'F': " + list);

        int size = list.size();
        System.out.println("Size of ArrayList: " + size);
    }
}
