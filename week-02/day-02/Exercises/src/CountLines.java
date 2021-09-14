import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CountLines {
    // Write a function that takes a filename as string as a parameter
    // and returns the number of lines the file contains.
    // It should return zero if it can't open the file
    // and should not raise any error.
    public static void main(String[] args) {

        System.out.println(countLines("src/text.csv"));

    }
    public static int countLines(String fileName){

        try{
            Path filePath = Path.of(fileName);
            List <String> list = Files.readAllLines(filePath);
            return list.size();

        }catch(IOException e){

            System.exit(2);
            return 0;

        }


    }
}
