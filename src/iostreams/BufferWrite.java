package iostreams;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class BufferWrite {
    static void main() {
        Path path = Paths.get("C:\\Users\\ymr482\\JAVA\\Learning and Practice\\src\\IOStreams\\demo.txt");
        try(BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.CREATE)){
            writer.write("New data");
            writer.newLine();
            writer.write("new data in next line");
            writer.newLine();
            System.out.println("Written Successfully!");
        }catch(Exception e){
            System.out.println("Error!");
        }
    }
}