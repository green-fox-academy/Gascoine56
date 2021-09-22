package AircraftCarrier;

public class Aircraft {
    private final int maxAmmo;
    private final int baseDamage;
    private final String type;
    private int currentAmmo = 0;

    Aircraft(int maxAmmo, int baseDamage, String type) {
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
        this.type = type;
    }

    public int fight() {
        int x = currentAmmo;
        currentAmmo = 0;
        return x * baseDamage;
    }

    public int refillAmmo(int refill) {
        if (refill + currentAmmo < maxAmmo) {
            currentAmmo += refill;
            return 0;
        } else {
            int temp = currentAmmo;
            currentAmmo = maxAmmo;
            return refill - maxAmmo + temp;
        }
    }
    public int ammoNeed(){
        return maxAmmo - currentAmmo;
    }

    public String getType() {
        return type;
    }

    public void getStatus() {
        System.out.println("Type: " + type + ", Ammo: " + currentAmmo + ", base damage: " + baseDamage + ", all damage: " + (currentAmmo * baseDamage));
    }
    public int getTotalDamage(){
        return currentAmmo * baseDamage;
    }

    public boolean isPriority() {
        if (type.equals("F35")) {
            return true;
        } else {
            return false;
        }
    }

}
