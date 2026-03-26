import java.io.*;
import java.net.*;

public class SimpleServer {

    public static void main(String[] args) {

        try {
            // Step 1: Create Server Socket with port number
            ServerSocket server = new ServerSocket(5000);
            System.out.println("Server started...");
            System.out.println("Waiting for client...");

            // Step 2: Accept client connection
            Socket socket = server.accept();
            System.out.println("Client connected!");

            // Step 3: Create input stream to receive data
            DataInputStream input = new DataInputStream(socket.getInputStream());

            // Step 4: Read message from client
            String message = input.readUTF();
            System.out.println("Message from Client: " + message);

            // Step 5: Close connections
            input.close();
            socket.close();
            server.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}