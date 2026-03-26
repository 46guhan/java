import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileIODemo {

    public static void main(String[] args) {

        try {

            // ==============================
            // Create a New File
            // ==============================
            File file = new File("sample.txt");

            if(file.createNewFile()) {
                System.out.println("File Created: " + file.getName());
            } else {
                System.out.println("File already exists");
            }


            // ==============================
            // Write to File
            // ==============================
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("Hello Java File Handling\n");
            writer.write("This is I/O Stream Example\n");
            writer.close();

            System.out.println("File Written Successfully");


            // ==============================
            // Read File
            // ==============================
            FileReader reader = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;

            System.out.println("\nReading File:");
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();


            // ==============================
            // Delete File
            // ==============================
            File deleteFile = new File("sample.txt");

            if(deleteFile.delete()) {
                System.out.println("\nFile Deleted Successfully");
            } else {
                System.out.println("\nFile Delete Failed");
            }

        }

        catch(IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

    }
}

