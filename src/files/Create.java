package files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Create {
    static void main() {
        // path cannot create directories! if some folder is missing it throws error!
        Path path = Paths.get("C:\\Users\\ymr482\\JAVA\\Learning and Practice\\src\\files\\demo.txt");
        if(Files.exists(path)){
            System.out.println("File already exists!");
        }
        else{
            try{
                Files.createFile(path);
                System.out.println("File created successfully!");
            }catch(Exception e){
                System.out.println("Some error occurred!");
            }
        }
    }
}