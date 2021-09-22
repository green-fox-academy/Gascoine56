package AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class AircraftCarrier {
    private int ammoStorage;
    private int health;
    List<Aircraft> carrier = new ArrayList<>();

    AircraftCarrier(int ammoStorage, int health) {
        this.ammoStorage = ammoStorage;
        this.health = health;
    }

    public void add(String type) {
        if (type.equals("F35")) {
            carrier.add(new F35());
        } else if (type.equals("F16")) {
            carrier.add(new F16());
        } else {
            System.out.println("No such aircraft type.");
        }
    }

    public int getSize() {
        return carrier.size();
    }

    public int getAmmoNeed() {
        int x = 0;
        for (int i = 0; i < carrier.size(); i++) {
            x += carrier.get(i).ammoNeed();
        }
        return x;
    }

    public void fill() {
        if (ammoStorage <= 0) {
            /*throw new RuntimeException(); */
            System.out.println("No ammo! ");
        } else {
            for (int i = 0; i < carrier.size(); i++) {
                if (carrier.get(i).isPriority()) {
                    ammoStorage = carrier.get(i).refillAmmo(ammoStorage);
                    carrier.get(i).refillAmmo(ammoStorage);
                }
            }
            for (int i = 0; i < carrier.size(); i++) {
                if (!carrier.get(i).isPriority()) {
                    ammoStorage = carrier.get(i).refillAmmo(ammoStorage);
                    carrier.get(i).refillAmmo(ammoStorage);
                }
            }
        }

    }

    public int totalDamage() {
        int damage = 0;
        for (int i = 0; i < carrier.size(); i++) {
            damage += carrier.get(i).getTotalDamage();
        }
        return damage;
    }

    public void getStatus() {
        if (health <= 0) {
            System.out.println("The carrier is dead.");
        } else {
            System.out.println("HP :" + health + "Aircraft count: " + carrier.size() + "Ammo Storage: " + ammoStorage + "Total damage: " + totalDamage());
            for (int i = 0; i < carrier.size(); i++) {
                carrier.get(i).getStatus();
            }
        }
    }

    public void fight(AircraftCarrier x) {
        for (int i = 0; i < carrier.size(); i++) {
            x.health -= carrier.get(i).fight();
        }
    }
}
