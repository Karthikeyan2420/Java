public class except1 {
    public static void main(String[] args) {
        try {

            int result = 10/0;

        } catch (Exception e) {

            System.out.println("An unexpected exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }

}
