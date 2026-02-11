package files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Delete {
    static void main() {
        Path path = Paths.get("C:\\Users\\ymr482\\JAVA\\Learning and Practice\\src\\files\\demo.txt");
        try{
            Files.deleteIfExists(path);
            System.out.println("File deleted Successfuly!");
        }catch(Exception e){
            System.out.println("Some error occurred!");
        }
    }
}
