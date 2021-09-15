import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Births {

    // Create a function that
    // - takes the name of a CSV file as a parameter,
    //   - every row is in the following format: <person name>;<birthdate in YYYY-MM-DD format>;<city name>
    // - and returns the year when the most births happened.
    //   - if there were multiple years with the same number of births then return any of them

    // You can find such a CSV file in this directory named births.csv
    // If you pass "births.csv" to your function, the result should be either 2006 or 2016
    public static void main(String[] args) throws IOException {
        Path x = Path.of("src/Births.csv");
        births(x);

    }

    private static void births(Path x) throws IOException {
        List <String> readFile = Files.readAllLines(x);
        List <String> dates = new ArrayList<>();
        HashMap <String, Integer> hm = new HashMap<>();


        for (String line : readFile) {
            String [] lineTemp = line.split(";");
            String [] lineTemp2 = lineTemp[1].split("-");
            dates.add(lineTemp2[0]);


        }
        for (String year: dates){
            if(!hm.containsKey(year)){
                hm.put(year, 1);
            }
            else{
               hm.computeIfPresent(year, (k, v) -> v+1 );

            }

        }
        int amount = 1;
        String maxYear = "";
        for (String key: hm.keySet()) {
            if(hm.get(key)>amount){
                amount = hm.get(key);
                maxYear = key;
            }

        }

        System.out.println(maxYear);








    }
}
