package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {
    List<Ship> ships = new ArrayList<>();

    public void populateArmada(int n) {
        for (int i = 0; i < n; i++) {
            ships.add(new Ship());

        }
    }

    public void addShip() {
        ships.add(new Ship());
    }

    public void fillArmada() {
        for (Ship ship : ships) {
            ship.fillShip();
        }
    }

    public void makeWarInteresting() {
        for (Ship ship : ships) {
            ship.killRandomPirates();
        }
    }

    public Ship getShip(int index) {
        return ships.get(index);
    }

    public void removeShip(int x) {
        ships.remove(x);
    }

    public int getSize() {
        return ships.size();
    }

    public boolean isEmpty() {
        if (ships.isEmpty()) ;
        return true;
    }

    public boolean war(Armada armada) {
        while (ships.size() > 0 && armada.getSize() > 0) {
            if (ships.get(0).getCalculatedScore() >= armada.getShip(0).getCalculatedScore()) {
                armada.removeShip(0);
            } else {
                ships.remove(0);
            }
        }
        if (ships.isEmpty()) {
            boolean x = false;
        } else if (armada.isEmpty()) {
        }
        boolean x = true;
        return x;
    }
}