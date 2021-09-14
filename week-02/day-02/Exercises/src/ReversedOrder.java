import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
    // Create a method that decrypts reversed-order.txt

    public static void main(String[] args) {
        Path read = Path.of("src/Orderor");
        Path write = Path.of("src/Ordernew");

        reverseOrder(read, write);

    }

    private static void reverseOrder(Path read, Path write) {

        try{
            List <String> readList = Files.readAllLines(read);
            List<String> writeList = new ArrayList<>();
            for (int i = readList.size()-1; i >=0 ; i--) {
                writeList.add(readList.get(i));

            }
            Files.write(write, writeList);


        }catch(IOException e){
            System.err.println("Error");
        }




    }
}


