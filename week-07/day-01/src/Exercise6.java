public class Exercise6 {
    public static void main(String[] args) {
        String str = "AaBbCCDD";
                str.chars()
                        .filter(x -> x >= 65 && x <= 90)
                        .mapToObj(Character::toString).forEach(System.out::println);

    }
}