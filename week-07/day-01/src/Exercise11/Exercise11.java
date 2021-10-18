package Exercise11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise11 {
    public static void main(String[] args) throws IOException {
        Path readPath = Paths.get("src/Exercise11/input.txt");

        String[] arr = Files.readString(readPath).replaceAll("[^[a-zA-Z]*$]", " ").split(" ");
        Map<Object, Long> hm = Arrays.stream(arr).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        hm.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(100).forEach((x) -> {
            if (x.getKey() != "") {
                System.out.println(x);
            }
        });
    }
}