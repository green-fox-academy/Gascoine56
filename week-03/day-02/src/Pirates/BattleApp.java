package Pirates;

public class BattleApp {
    public static void main(String[] args) {
        Ship myShip = new Ship();
        Ship yourShip = new Ship();
        myShip.fillShip();
        yourShip.fillShip();
        yourShip.battle(myShip);
        yourShip.getShipInfo();
        myShip.getShipInfo();
        yourShip.getPirate(0).printIntoxication();
    }
}