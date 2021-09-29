import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class CAB {
    Random random = new Random();
    int generator = random.nextInt(10000);
    String lookingFor = String.format("%04d", generator);
    boolean finished = false;
    int numberOfGuesses = 0;
    Scanner scanner = new Scanner(System.in);


    public void checkGuess() {
        long x = 10000000;

        while (x > 9999) {

                System.out.println("Guess a number 0 - 9999: ");
            try {
                x = scanner.nextLong();
                if (x == 0000){
                    System.out.println("Correct number is " + lookingFor);
                }
            }catch (InputMismatchException exception){
                System.out.println("Number is too big for Long value - Congratulations, you crashed the program!");
                System.exit(20);
            }
        }
        String guessedNumber = String.format("%04d", x);
        if (returnCAB(guessedNumber) == 4) {
            System.out.println("Correct! You have the right number : " + lookingFor);
            finished = true;
        } else {
            checkGuess();
        }
    }


    public int returnCAB(String guessedNumber) {
        int cows = 0;
        int bulls = 0;
        for (int i = 0; i < 4; i++) {
            if (guessedNumber.charAt(i) == lookingFor.charAt(i)) {
                cows += 1;
            } else {
                for (int j = 0; j < 4; j++) {
                    if (lookingFor.charAt(j) == guessedNumber.charAt(i))
                       bulls += 1;
                }
            }
        }
        numberOfGuesses += 1;
        System.out.println("Number of guesses : " + numberOfGuesses);
        System.out.println(cows + " cows, " + bulls + " bulls");
        return cows;


    }


}

