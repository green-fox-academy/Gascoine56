package Pirates;

import javax.print.attribute.standard.PrinterIsAcceptingJobs;

public class Main {

    public static void main(String[] args) {
        Ship myShip = new Ship();
        Ship yourShip = new Ship();
        Parrot parrot = new Parrot("Papagaj");
        parrot.comment();
        myShip.fillShip();
        yourShip.fillShip();
        yourShip.releaseTheKraken();
        yourShip.getShipInfo();

    }
}
