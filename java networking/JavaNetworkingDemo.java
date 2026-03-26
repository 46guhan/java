import java.io.*;
import java.net.*;
import java.util.Scanner;

public class JavaNetworkingDemo {

    public static void main(String[] args) throws Exception {

        System.out.println("=== Java Networking Demo ===\n");

        inetAddressExample();
        urlExample();

    }

    /* 
     * 1. InetAddress Example
     * Used to get IP address information.
     * Real-world use:
     * - Checking server IP
     * - DNS lookup
     */
    static void inetAddressExample() throws UnknownHostException {

        System.out.println("1. InetAddress Example");

        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println("Local Host Name : " + localHost.getHostName());
        System.out.println("Local IP Address: " + localHost.getHostAddress());

        InetAddress google = InetAddress.getByName("www.google.com");
        System.out.println("Google IP Address: " + google.getHostAddress());

        System.out.println();
    }

    /* 
     * 2. URL Example
     * Used to read data from websites.
     * Real-world use:
     * - Reading API data
     * - Fetching web content
     */
    static void urlExample() throws Exception {

        System.out.println("2. URL Example");

        URL url = new URL("https://www.example.com");
        BufferedReader br = new BufferedReader(
                new InputStreamReader(url.openStream())
        );

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();

        System.out.println();
    }

    /* 
     * 3. TCP Server Example
     * Uses ServerSocket
     * Real-world use:
     * - Chat applications
     * - Banking systems
     */
    static void tcpServer() throws IOException {

        System.out.println("TCP Server Started...");
        ServerSocket serverSocket = new ServerSocket(5000);

        Socket socket = serverSocket.accept();
        System.out.println("Client Connected");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
        );
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String clientMessage = in.readLine();
        System.out.println("Client says: " + clientMessage);

        out.println("Hello Client, Message received!");

        socket.close();
        serverSocket.close();
    }

    /* 
     * 4. TCP Client Example
     * Uses Socket
     * Connects to TCP server
     */
    static void tcpClient() throws IOException {

        Socket socket = new Socket("localhost", 5000);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
        );
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        out.println("Hello Server!");
        System.out.println("Server Reply: " + in.readLine());

        socket.close();
    }
}
