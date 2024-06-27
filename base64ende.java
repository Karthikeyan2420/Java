import java.util.Base64;

public class base64ende {
    public static void main(String[] args) {
        // String to be encoded
        String originalString = "Hello, World!";

        // Encoding
        String encodedString = Base64.getEncoder().encodeToString(originalString.getBytes());
        System.out.println("Encoded string: " + encodedString);

        // Decoding
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println("Decoded string: " + decodedString);
    }
}
