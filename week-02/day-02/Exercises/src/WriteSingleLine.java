import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    // Write a function that is able to manipulate a file
    // by writing your name into it as a single line.
    // The file should be named "my-file.txt".
    // In case the program is unable to write the file,
    // it should print the following error message: "Unable to write file: my-file.txt".
    public static void main(String[] args) {
        fileWrite("src/my-file.txt");



    }
    public static void fileWrite(String file){
        List <String> x = new ArrayList<>();
        x.add("Palo");
        Path filePath = Path.of(file);
        try{
            Files.write(filePath, x);

        }catch(IOException e){
            System.out.println("Unable to write file: my-file.txt");
        }

    }
}
