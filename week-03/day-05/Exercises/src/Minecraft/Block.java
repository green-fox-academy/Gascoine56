package Minecraft;

import java.util.ArrayList;

public class Block {
    private String blockType;
    private boolean transform;
    private String blockColor;
    private int lightTransmission;
    private boolean crossable;
    private String[] adjacent;
    private String producer;
    private Quality quality;
    private ArrayList<String> transformsFrom;


    public Block(String blockType, String blockColor, int lightTransmission, boolean crossable, String[] adjacent) {
        this.blockType = blockType;
        this.blockColor = blockColor;
        this.lightTransmission = lightTransmission;
        this.crossable = crossable;
        this.adjacent = adjacent;
    }

    public Block(String blockType, String blockColor, int lightTransmission, boolean crossable, String[] adjacent, ArrayList<String> transformsFrom) {
        this.blockType = blockType;
        this.blockColor = blockColor;
        this.lightTransmission = lightTransmission;
        this.crossable = crossable;
        this.adjacent = adjacent;
        this.transformsFrom = transformsFrom;
    }

    public ArrayList<String> getTransformsFrom() {
        return transformsFrom;
    }

    public Block(String window, String[] blocks) {
        this.blockType = window;
        this.adjacent = blocks;
    }

    public Block(String blockType, String blockColor, boolean crossable, String[] blocks) {
        this.blockType = blockType;
        this.blockColor = blockColor;
        this.crossable = crossable;
        this.adjacent = blocks;
    }

    public Block(String door, boolean crossable, String[] blocks) {
        this.blockType = door;
        this.crossable = crossable;
        this.adjacent = blocks;
    }

    public Block(String blockType, int lightTransmission, boolean crossable, String[] blocks) {
        this.blockType = blockType;
        this.lightTransmission = lightTransmission;
        this.crossable = crossable;
        this.adjacent = blocks;
    }

    public boolean canPlaceAfter(String blockName) {
        for (String s : adjacent) {
            if (s.equals(blockName)) {
                return true;
            }
        }
        return false;
    }

    public void setLightTransmission(int lightTransmission) {
        this.lightTransmission = lightTransmission;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getBlockType() {
        return blockType;
    }

    public void setBlockColor(String color) {
        blockColor = color;
    }

    public void setCrossable(boolean crossable) {
        this.crossable = crossable;
    }

    public void setTransform(boolean transform) {
        this.transform = transform;
    }

    public String getProducer() {
        return producer;
    }

    public double getLightTransmission() {
        return lightTransmission;
    }

    public boolean getTransform() {
        return transform;
    }

    public Quality getQuality() {
        return quality;
    }

    public void printStatus() {
        System.out.println("This block is of " + blockType + " type");
        System.out.println("The color is " + blockColor);
        System.out.println("Has light transmission: " + lightTransmission);
        if (crossable) {
            System.out.println("You can cross this block.");
        } else {
            System.out.println("You can not cross this block. It is solid.");
        }
    }

    public void transform(ArrayList wall, String blockType) {

    }
}