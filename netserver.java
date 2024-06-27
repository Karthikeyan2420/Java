import java.io.*;
import java.net.*;

public class netserver {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;

        try {
            // Create a server socket listening on port 12345
            serverSocket = new ServerSocket(12345);
            System.out.println("Server is listening on port 12345");

            // Wait for a client to connect
            clientSocket = serverSocket.accept();
            System.out.println("Client connected");

            // Create input and output streams to communicate with the client
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Read a message from the client
            String clientMessage = in.readLine();
            System.out.println("Received from client: " + clientMessage);

            // Send a response to the client
            out.println("Message received: " + clientMessage);

            // Close the streams and socket
            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}