import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise9 {
    public static void main(String[] args) {
        String text = "Koleno ma bolelo, NOha sa mi ZloMilA";
        System.out.println(Stream.of(text.split("")).collect(Collectors.groupingBy(c -> c, Collectors.counting())));
    }
}