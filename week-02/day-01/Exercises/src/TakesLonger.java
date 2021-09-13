public class TakesLonger {
    // When saving this quote a disk error has occurred. Please fix it!
    // Insert the words "always takes longer than" between the words "It" and "you" using the StringBuilder class!
    // Use pieces of the quote variable (instead of just redefining the string)!

    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        System.out.println(quote);

        StringBuilder str = new StringBuilder("Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.");
        str.insert(20," always takes longer than" );

        System.out.println(str);
    }
}
