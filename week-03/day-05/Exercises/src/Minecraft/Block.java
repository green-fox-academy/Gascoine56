package Minecraft;

public class Block {
    private final String blockType;
    private String blockColor;
    private double lightTransmission;
    private boolean crossable;
    private String[] adjacent;
    private String producer;
    private Quality quality;


    public Block(String blockType, String blockColor, double lightTransmission, boolean crossable, String[] adjacent) {
        this.blockType = blockType;
        this.blockColor = blockColor;
        this.lightTransmission = lightTransmission;
        this.crossable = crossable;
        this.adjacent = adjacent;
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

    public String[] getAdjacent() {
        return adjacent;
    }

    public boolean canPlaceAfter(String blockName) {
        for (String s : adjacent) {
            return s.equals(blockName);
        }
        return false;
    }

    public void setLightTransmission(double lightTransmission) {
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

    public void printStatus() {
        System.out.println("This block is of " + blockType + " type");
        System.out.println("The color is " + blockColor);
        if (crossable) {
            System.out.println("You can cross this block.");
        } else {
            System.out.println("You can not cross this block. It is solid.");
        }
    }
}
