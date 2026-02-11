package files;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Info {
    static void main() {
        Path path = Paths.get("C:\\Users\\ymr482\\JAVA\\Learning and Practice\\src\\files\\demo.txt");
        if(Files.exists(path)){
            System.out.println("Files exists!");
            System.out.println("Is readable: "+Files.isReadable(path));
            System.out.println("Is writable: "+Files.isWritable(path));
        }else{
            System.out.println("Files does not exist");
        }
    }
}
