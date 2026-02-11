package files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Write {
    static void main() {
        Path path = Paths.get("C:\\Users\\ymr482\\JAVA\\Learning and Practice\\src\\files\\demo.txt");
        String content = "This is written into a file";
        try{
            Files.write(path, content.getBytes());

            String moreContent = "This gets appended into a file";
            Files.write(path, moreContent.getBytes(), StandardOpenOption.APPEND);

            System.out.println("Written into file successfully!");

        }catch(Exception e){
            System.out.println("Error writing into a file");
        }
    }
}