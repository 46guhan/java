/*
 * ✔ FileWriter (character output)
 * ✔ FileReader (character input)
 * ✔ BufferedReader (fast reading)
 * ✔ BufferedWriter (fast writing)
 * ✔ FileInputStream (byte input)
 * ✔ FileOutputStream (byte output)
 *
 * IMPORTANT IDEA
 * Stream = flow of data
 * Byte Streams → for binary data (images, pdf)
 * Character Streams → for text data
 */

import java.io.*;

public class IOStreamsDemo {

    // 🔹 Example 1: Write text using FileWriter
    static void fileWriterExample() {
        System.out.println("\n--- FileWriter Example ---");

        try {
            FileWriter fw = new FileWriter("sample.txt");
            fw.write("Hello from FileWriter!\n");
            fw.write("Java IO Streams are easy.");
            fw.close();

            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    // 🔹 Example 2: Read text using FileReader
    static void fileReaderExample() {
        System.out.println("\n--- FileReader Example ---");

        try {
            FileReader fr = new FileReader("sample.txt");

            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // 🔹 Example 3: BufferedWriter (faster writing)
    static void bufferedWriterExample() {
        System.out.println("\n--- BufferedWriter Example ---");

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("buffer.txt"));

            bw.write("This is buffered writing.\n");
            bw.write("It is faster than FileWriter.");
            bw.newLine();

            bw.close();

            System.out.println("Buffered write completed.");
        } catch (IOException e) {
            System.out.println("Buffered write error: " + e.getMessage());
        }
    }

    // 🔹 Example 4: BufferedReader (faster reading)
    static void bufferedReaderExample() {
        System.out.println("\n--- BufferedReader Example ---");

        try {
            BufferedReader br = new BufferedReader(new FileReader("buffer.txt"));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Buffered read error: " + e.getMessage());
        }
    }

    // 🔹 Example 5: Byte Streams (FileInputStream/FileOutputStream)
    static void byteStreamExample() {
        System.out.println("\n--- Byte Stream Example ---");

        try {
            // write bytes
            FileOutputStream fos = new FileOutputStream("bytefile.txt");
            String data = "Byte stream example";
            fos.write(data.getBytes());
            fos.close();

            // read bytes
            FileInputStream fis = new FileInputStream("bytefile.txt");
            int b;
            while ((b = fis.read()) != -1) {
                System.out.print((char) b);
            }
            fis.close();

        } catch (IOException e) {
            System.out.println("Byte stream error: " + e.getMessage());
        }
    }

    // 🔹 MAIN METHOD
    public static void main(String[] args) {

        System.out.println("===== JAVA IO STREAMS DEMO =====");

        fileWriterExample();
        fileReaderExample();
        bufferedWriterExample();
        bufferedReaderExample();
        byteStreamExample();

        System.out.println("\n===== PROGRAM END =====");
    }
}
