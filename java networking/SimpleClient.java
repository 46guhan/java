import java.io.*;
import java.net.*;

public class SimpleClient {

    public static void main(String[] args) {

        try {
            // Step 1: Connect to server using IP and port
            Socket socket = new Socket("localhost", 5000);

            System.out.println("Connected to Server");

            // Step 2: Create output stream to send data
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());

            // Step 3: Send message to server
            output.writeUTF("Hello Server! This is Client.");

            // Step 4: Close connection
            output.close();
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}