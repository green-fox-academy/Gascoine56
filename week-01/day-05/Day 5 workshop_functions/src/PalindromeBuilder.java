import java.util.Arrays;

public class PalindromeBuilder {
    //Create a function named createPalindrome() following your current language's style guide.
    // It should take a string, create a palindrome from it and then return it.
    public static void main(String [] args){
        String x = "gula";

        createPalindrome(x);

    }
    public static void createPalindrome(String x){
        char []arrayA = new char [(x.length())];
        char []arrayB = new char [(x.length())];
        for (int i = 0; i <x.length() ; i++) {
            arrayA[i] = x.charAt(i);
            arrayB[i] = x.charAt((x.length()-i-1));
        }
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i]);
        }
        for (int i = 0; i < arrayB.length; i++) {
            System.out.print(arrayB[i]);
        }
    }
}
