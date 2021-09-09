import java.util.Scanner;

public class Main {

    //Task Substring
    // Create a function that takes two strings as a parameter
    // Returns the starting index where
    // the second one is starting in the first one
    // Returns `-1` if the second string is not in the first one

    // Example:

    // should print: `17`
    //System.out.println(subStr("this is what I'm searching in", "searching"));

    // should print: `-1`
    //System.out.println(subStr("this is what I'm searching in", "not"));

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Type the first string");
        String str1 = scanner.nextLine();
        System.out.println("Type the second string");
        String str2 = scanner.nextLine();

        System.out.println(str1.indexOf(str2));


    }
}
