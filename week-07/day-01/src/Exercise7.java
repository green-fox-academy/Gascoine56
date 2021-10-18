import java.util.Arrays;
import java.util.List;

public class Exercise7 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        System.out.println(findThese(cities, 'N'));
    }

    public static List<String> findThese(List<String> list, char c) {
        return list.stream().filter(x -> x.charAt(0) == c).toList();
    }
}