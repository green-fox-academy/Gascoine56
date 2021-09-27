package Sharpie;

public class Sharpie {
    private Double inkAmount = 100.0;

    public Sharpie(String color, Double width) {
    }

    public double use() {
        return inkAmount -= 50;
    }

    public double getInkAmount() {
        return inkAmount;
    }
}
