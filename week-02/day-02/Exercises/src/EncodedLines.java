import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodedLines {

    public static void main(String[] args) {
        Path x = Path.of("src/Encoded.txt");
        Path y = Path.of("src/Decoded.txt");
        decode(x, y);
    }

    private static void decode(Path x, Path y) {

        try {
            String str = "";
            List<String> readFile = Files.readAllLines(x);
            List<String> decoded = new ArrayList<>();

            for (int i = 0; i < readFile.size(); i++) {
                for (int j = 0; j < readFile.get(i).length(); j++) {
                    char c =  readFile.get(i).charAt(j);
                    if(!Character.isWhitespace(c)){
                        c -= 1;
                        str += c;
                    }
                    else{
                        str += c;
                    }


                }
                decoded.add(str);
                str = "";








            }
            Files.write(y, decoded);




        }catch (IOException e){
            System.out.println("Can not read file");
        }

















    }
}
