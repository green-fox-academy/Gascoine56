package TwentyPlusOne;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        deck.shuffleDeck();
        System.out.println();
        int opponentScore = generateNumber();
        int playerScore = deck.getCard(0).rankValue;
        deck.pullFirst();
        playerScore += deck.getCard(0).rankValue;
        deck.pullFirst();
        System.out.println("The score of your opponent is : " + opponentScore);
        System.out.println("Your initial score is: " + playerScore);
        while (playerScore <= 21){
            System.out.println("Do you want to pull another card? (yes/no)");
            String x =scanner.nextLine();
            if (x.equals("yes")){
                playerScore += deck.getCard(0).rankValue;
                deck.pullFirst();
                System.out.println("The score of your opponent is : " + opponentScore);
                System.out.println("Your score is: " + playerScore);
            }
            else break;
        }
        if (playerScore < opponentScore | playerScore > 21){
            System.out.println("You lose!");
        }else {
            System.out.println("You win");
        }


    }
    public static int generateNumber(){
        Random r = new Random();
        return r.nextInt(7) + 15;
    }
}
