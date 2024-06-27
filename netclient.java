
import java.io.*;
import java.net.*;

public class netclient {
    public static void main(String[] args) {
        Socket socket = null;
        PrintWriter out = null;
        BufferedReader in = null;

        try {
            // Connect to the server on localhost at port 12345
            socket = new Socket("localhost", 12345);

            // Create input and output streams to communicate with the server
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Send a message to the server
            out.println("Hello, Server!");

            // Read the response from the server
            String serverResponse = in.readLine();
            System.out.println("Received from server: " + serverResponse);

            // Close the streams and socket
            in.close();
            out.close();
            socket.close();
        } catch (UnknownHostException e) {
            System.err.println("Unknown host: localhost");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
