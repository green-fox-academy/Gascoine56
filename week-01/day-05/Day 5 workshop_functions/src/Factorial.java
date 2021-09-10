import java.util.Scanner;

public class Factorial {
    // - Create a function called `calculateFactorial()`
    //   that returns the factorial of its input
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int input = scanner.nextInt();
        System.out.println(calculateFactorial(input));



    }
    public static int calculateFactorial(int x){
        int factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
