package Exercise12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Exercise12 {
    public static void main(String[] args) throws IOException {
       List<String> arrSource = Files.readAllLines(Paths.get("src/Exercise12/input.txt"));
       List<String[]> arr = arrSource.stream().map(x -> x.split(";")).collect(Collectors.toList());

       OptionalInt maxMass = arr.stream().mapToInt(x -> Integer.parseInt(x[2])).max();
       arr.stream().filter(x -> Integer.parseInt(x[2]) == (int) maxMass)
    }
}
