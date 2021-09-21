package Pirates;

import java.util.Random;

public class Pirate {
    private int intoxication = 0;
    private boolean death = false;

    public void drinkSomeRum() {
        if (death == true) {
            System.out.println("The pirate is dead");
        } else {
            Random x = new Random();
            int y = x.nextInt(50);
            intoxication += y;
        }
    }

    public void howsItGoingMate() {
        if (death == true) {
            System.out.println("The pirate is dead");
        } else {
            if (intoxication < 4) {
                System.out.println("Pirate says: Pour me anudder!");
            } else {
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin? <Passed out>");
                intoxication = 0;
            }
        }

    }

    public void printIntoxication() {
        if (death) {
            System.out.println("The pirate is dead");
        } else {
            System.out.println("Wasted level is: " + intoxication);

        }
    }

    public void brawl(Pirate pirate) {
        if (pirate.death || death == true) {
            System.out.println("Tough luckone of the pirates is dead.");
        }
        Random x = new Random();
        int chance = x.nextInt(100);
        if (chance < 33) {
            die();
            System.out.println("Loser. Your pirate dies!");
        } else if (chance < 66) {
            pirate.die();
            System.out.println("Winner! Your pirate won!");
        } else {
            pirate.die();
            die();
            System.out.println("Both pirates died!");
        }
    }

    public void die() {
        death = true;
        intoxication = 0;
    }

    public boolean getDeathStatus() {
        return death;
    }

    public int getIntoxication() {
        return intoxication;
    }
}
