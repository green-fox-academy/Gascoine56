import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Log {

    // Read all data from 'log.txt'
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses
    // Write a function that returns the GET / POST request ratio
    public static void main(String[] args) throws IOException {
        Path log = Path.of("src/Log.txt");
        List <String> total = new ArrayList<>();
        List <String> ips = new ArrayList<>();

        total = Files.readAllLines(log);
        int counterGet = 0;
        int counterPost = 0;
        for (int i = 0; i < total.size(); i++) {
           String line = total.get(i);
           String [] array = line.split(" ");
           ips.add(array[8]);
           if(array[11].equals("GET")){
               counterGet++;

           }
           else if (array[11].equals("POST")){
               counterPost++;

            }

        }
        double ratio = (counterGet/counterPost);
        System.out.println(ratio);
        System.out.println(ips);




    }
}
