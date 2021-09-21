package Pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    List<Pirate> ship = new ArrayList<>();

    public void fillShip() {
        for (int i = 0; i < 113; i++) {
            ship.add(new Pirate());
        }
    }

    public void getShipInfo() {

        if (ship.get(0).getDeathStatus()) {
            System.out.println(
                    "  /  /  /  /\n" +
                            " /----------(\n" +
                            "< x x x o  X(\n" +
                            " \\----------(\n" +
                            "  \\  \\  \\  \\");
            System.out.println("The captain is dead!");
        } else {
            System.out.println(
                    "  /  /  /  /\n" +
                            " /----------(\n" +
                            "< o o o o  O(\n" +
                            " \\----------(\n" +
                            "  \\  \\  \\  \\");
            System.out.println("The captain lives!");
            System.out.println(howManyAlive() + " pirates and captain are still alive.");
        }
    }

    public int howManyAlive() {
        int counter = 0;
        for (int i = 1; i < ship.size(); i++) {
            if (!ship.get(i).getDeathStatus()) {
                counter++;
            }
        }
        return counter;
    }

    public Pirate getPirate(int i) {
        return ship.get(i);
    }

    public void releaseTheKraken() {
        for (int i = 0; i < ship.size(); i++) {
            ship.get(i).die();
        }
        System.out.println("Kraken has been released. Everyone died !");
        System.out.println(howManyAlive() + " pirates are still alive.");
    }

    public int getCalculatedScore() {
        int crew = howManyAlive();
        int captainDrunk = ship.get(0).getIntoxication();
        return crew - captainDrunk;

    }
    public int getShipSize(){
        return ship.size();
    }

    public boolean battle(Ship ship) {
        boolean result = ship.getCalculatedScore() <= this.getCalculatedScore();
        if(result){
            Random x = new Random();
            int losses = x.nextInt(ship.getShipSize());
            for (int i = 1; i <= losses; i++) {
                ship.getPirate(i).die();
            }
            System.out.println(losses + " pirates have died on enemy ship.");
            for (int i = 0; i < ship.getShipSize(); i++) {
                this.ship.get(i).drinkSomeRum();
            }
        }
        else{
            Random x = new Random();
            int losses = x.nextInt(ship.howManyAlive());
            for (int i = 1; i <= losses; i++) {
                this.ship.get(i).die();
            }
            System.out.println(losses + " pirates have died on my ship.");
            for (int i = 0; i < ship.getShipSize(); i++) {
                ship.getPirate(i).drinkSomeRum();
            }
        }
        return result;
        }
}
