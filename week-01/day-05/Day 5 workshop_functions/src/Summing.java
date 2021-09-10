import java.util.Scanner;
// Write a function called `sum()` that returns the sum of numbers from zero to the given parameter
public class Summing {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(sum(x));
    }

    public static int sum(int x){
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum += i;

        }
        return sum;

    }
}
