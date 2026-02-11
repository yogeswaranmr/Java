package errors;

import java.io.FileOutputStream;
import java.io.IOException;

public class CloseResources {
    public static void main(String[] args) {
        // special type of 'try' for 'resources' like files and streams
        try(FileOutputStream output = new FileOutputStream("filename.txt")) {
            output.write("Hello".getBytes());
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}