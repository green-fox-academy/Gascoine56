package Pirates;

public class WarApp {
    public static void main(String[] args) {
        Armada napoleon = new Armada();
        Armada waterloo = new Armada();
        napoleon.addShip();


        napoleon.populateArmada(5);
        waterloo.populateArmada(5);

        napoleon.fillArmada();
        waterloo.fillArmada();

        napoleon.makeWarInteresting();
        waterloo.makeWarInteresting();

        for (Ship ship : napoleon.ships) {
            System.out.println(ship.howManyAlive());
        }
        System.out.println(" ");
        for (Ship ship : waterloo.ships) {
            System.out.println(ship.howManyAlive());
        }

        if (napoleon.war(waterloo)) {
            System.out.println("Your armada won!");
        } else {
            System.out.println("Enemy aramda won!");
        }

        System.out.println(" Your armada's remaining Ships: ");
        for (Ship ship : napoleon.ships) {
            System.out.println(ship.howManyAlive());
        }
        System.out.println(" Enemy armada's remaining Ships: ");
        for (Ship ship : waterloo.ships) {
            System.out.println(ship.howManyAlive());
        }

    }
}