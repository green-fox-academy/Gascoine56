package PetrolStation;

public class Station {
    private int gasAmount;

    public void refill(Car car) {
        this.gasAmount -= car.getCapacity();
        car.setGasAmount(car.getCapacity());
    }

    public int getGasAmount() {
        return this.gasAmount;
    }

    public Station() {
        this.gasAmount = 1000;
    }
}
