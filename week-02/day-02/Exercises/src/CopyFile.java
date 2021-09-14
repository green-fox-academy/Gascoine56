import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {

    // Write a function that copies the contents of a file into another file
    // It should take two filenames (string) as parameters:
    //  - path and name of the source file
    //  - path and name of the target file
    // It should return a boolean that shows if the copy was successful
    public static void main(String[] args) {
        String x = "src/my-file.txt";
        String y = "src/text.csv";
        System.out.println(copyFileContent(x, y));

    }

    public static boolean copyFileContent(String read, String write){
        Path readPath = Path.of(read);
        Path writePath = Path.of(write);

        List <String> contentRead = new ArrayList<>();

        try{
            contentRead = Files.readAllLines(readPath);
        }catch (IOException ioe){
            return false;
        }

        try{
            Files.write(writePath, contentRead);
            return true;
        }catch(IOException ioe){
            return false;
        }
    }
}
