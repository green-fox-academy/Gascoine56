import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversedLines {
    // Create a method that decrypts reversed-lines.txt
    public static void main(String[] args) {
        Path read = Path.of("src/ReversedLinesOriginal.txt");
        Path write = Path.of("src/ReversedLines");

        reverseLines(read, write);
    }

    public static void reverseLines(Path read, Path write) {

        try {
            List<String> readList = Files.readAllLines(read, StandardCharsets.UTF_8);
            List<String> writeList = new ArrayList<>();
            for (int i = 0; i < readList.size(); i++) {
                StringBuffer x = new StringBuffer(readList.get(i));
                writeList.add(x.reverse().toString());
            }
            Files.write(write, writeList);
        } catch (IOException e) {
            System.out.println("Read file or write file not successful");
            System.exit(456788);
        }
    }
}
