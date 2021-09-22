package AircraftCarrier;

public class Main {
    public static void main(String[] args) {
        AircraftCarrier carrier = new AircraftCarrier(1000, 3000);
        AircraftCarrier enemy = new AircraftCarrier(1000, 2000);

        carrier.add("F16");
        carrier.add("F16");
        carrier.add("F35");
        carrier.add("F35");
        carrier.add("F35");
        carrier.add("F35");
        carrier.add("F35");
        carrier.fill();
        System.out.println(carrier.totalDamage());
        carrier.fight(enemy);
        carrier.getStatus();
        enemy.getStatus();



    }
}