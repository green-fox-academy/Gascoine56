public class Strings3 {
    // Given a string,
    // compute recursively a new string where
    // all the adjacent chars are now separated by a `*`
    public static void main(String[] args) {
    String str = "Recursion sucks";
    int counter = 0;
    strings3(str, counter);
    }

    public static void strings3(String str, int counter){
        try {
            if (counter > str.length() - 2) {
                System.out.println(str.charAt(counter));
            } else if (str.charAt(counter) == ' ') {
                System.out.print(str.charAt(counter));
                strings3(str, counter + 1);
            } else {
                System.out.print(str.charAt(counter) + "*");
                strings3(str, counter + 1);
            }
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("empty string");
        }
    }
}
