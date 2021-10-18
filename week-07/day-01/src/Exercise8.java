import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
    public static void main(String[] args) {
        List <Character> chars = Arrays.asList('a', 'D', 'i', 'D', 'A', 's');
        String str = chars.stream().map(Object::toString).collect(Collectors.joining());
        System.out.println(str);
    }
}
