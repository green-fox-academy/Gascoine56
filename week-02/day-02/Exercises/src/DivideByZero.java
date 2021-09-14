import java.util.Scanner;

public class DivideByZero {

// Create a function that divides number 10
// by a number that's passed as a paramater and prints the result.
// It should print "fail" if the parameter is 0


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input an integer");
        int input = scan.nextInt();

        division(input);
    }



    public static void division (int input){

        try{


            System.out.println(10/input);

        }catch(ArithmeticException e){
            System.err.println("fail");
            System.exit(1);
        }



    }
}
