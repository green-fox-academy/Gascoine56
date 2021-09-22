package GardenApplication;

public class Flower extends Plant {
    private String type = "Flower";

    Flower(String color) {
        super(color);
    }

    public String getType() {
        return type;
    }

    public void waterIt(double waterAmount, double counter) {
        if (getWaterLevel() < 5) {
            setWaterLevel(getWaterLevel() + (waterAmount / counter * 0.75));
        }
    }

    public void waterNeedCheck() {
        if (getWaterLevel() >= 5) {
            setNeedsWater(false);
        }
    }
}



