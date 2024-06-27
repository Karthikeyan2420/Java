public class varargs1 {
    public static void main(String[] args) {
        printNumbers("Numbers:", 1, 2, 3, 4, 5);
        printNumbers("More Numbers:", 10, 20, 30, 40, 50, 60, 70);
    }

    // Method with varargs
    public static void printNumbers(String label, int... numbers) {
        System.out.println(label);
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
