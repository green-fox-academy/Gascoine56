package PetrolStation;

public class Main {
    public static void main(String[] args) {
        Car kia = new Car(0, 100);
        System.out.println(kia.getCapacity() + " " + kia.getGasAmount());
        Station benzina = new Station();
        benzina.refill(kia);
        System.out.println(kia.getCapacity() + " " + kia.getGasAmount());
        System.out.println(benzina.getGasAmount());
    }
}
