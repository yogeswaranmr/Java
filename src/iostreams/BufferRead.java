package iostreams;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BufferRead {
    static void main() {
        Path path = Paths.get("C:\\Users\\ymr482\\JAVA\\Learning and Practice\\src\\IOStreams\\demo.txt");

        try(BufferedReader reader = Files.newBufferedReader(path)){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch(Exception e){
            System.out.println("Error!");
        }
    }
}