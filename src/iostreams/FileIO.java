package iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIO {
    static void main() {
        // can use binary files too
        String src = "C:\\Users\\ymr482\\JAVA\\Learning and Practice\\src\\IOStreams\\demo.txt";
        String dest = "C:\\Users\\ymr482\\JAVA\\Learning and Practice\\src\\IOStreams\\dest.txt";
        try(FileInputStream input = new FileInputStream(src);
            FileOutputStream output = new FileOutputStream(dest)){
            byte[] inputBuffer = new byte[200];
            byte[] outputBuffer = new byte[200];
            int data;
            while ((data = input.read(inputBuffer))!=-1){
                output.write(outputBuffer, 0, data);
            }
        }catch(Exception e){
            System.out.println("Error!");
        }
    }
}
