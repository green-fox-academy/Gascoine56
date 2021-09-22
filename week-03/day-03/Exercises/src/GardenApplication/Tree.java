package GardenApplication;

public class Tree extends Plant {
    private String type = "Tree";

    Tree(String color) {
        super(color);
    }

    public String getType() {
        return type;
    }

    public void waterIt(double waterAmount, double counter) {
        if (getWaterLevel() < 10) {
            setWaterLevel((getWaterLevel() + waterAmount / counter) * 0.4);
        }
    }

    public void waterNeedCheck() {
        if (getWaterLevel() >= 10) {
            setNeedsWater(false);
        }
    }
}
