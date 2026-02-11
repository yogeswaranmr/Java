package files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Read {
    static void main() {
        Path path = Paths.get("C:\\Users\\ymr482\\JAVA\\Learning and Practice\\src\\files\\demo.txt");
        try{
            System.out.println("Data inside file:");
            List<String> lines = Files.readAllLines(path);
            for(String line : lines){
                System.out.println(line);
            }
        }catch(Exception e){
            System.out.println("Something went wrong!");
        }
    }
}
