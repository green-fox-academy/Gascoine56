package PetrolStation;

public class Car {
    private int gasAmount;
    private int capacity;
    public int getGasAmount(){
        return this.gasAmount;
    }
    public void setGasAmount(int gasAmount){
        this.gasAmount = gasAmount;
    }
    public int getCapacity(){
        return this.capacity;
    }
    public Car(int gasAmount, int capacity) {
        this.gasAmount = gasAmount;
        this.capacity = capacity;
    }
}
