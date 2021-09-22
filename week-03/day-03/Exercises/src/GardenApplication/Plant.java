package GardenApplication;

import GreenFoxInheritance.Person;

public class Plant {
    private String type;
    private double waterLevel = 0.0;
    private String color;
    private boolean needsWater = true;

    Plant(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean getWaterNeed() {
        return needsWater;
    }

    public String getType() {
        return type;
    }

    public double getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(double waterLevel) {
        this.waterLevel = waterLevel;
    }

    public void waterIt(double waterAmount, double counter) {

    }

    public void setNeedsWater(boolean needsWater) {
        this.needsWater = needsWater;
    }

    public void waterNeedCheck() {

    }
}
