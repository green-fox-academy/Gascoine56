import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class PrintEachLine {
    // Write a program that opens a file called "my-file.txt" and prints each
    // line from the file.
    // If the program is unable to read the file (for example the file does not exist),
    // it should print the following error message: "Unable to read file: my-file.txt".
    public static void main(String[] args) {
        Path filePath = Path.of("my-file.txt");
        try {
            List<String> content = Files.readAllLines(filePath);
        }catch(IOException e){
            System.err.println("Unable to read file: my-file.txt");
            System.exit(0);
        }finally{
            System.out.println("ALL done");
        }




    }


}
