package Minecraft;

public class Door extends Block {
    public static String[] blocks = {"Mud", "Brick", "Air", "Window"};

    public Door(Quality quality, String producer, String color, int transmission) {
        super("Door", true, blocks);
        setQuality(quality);
        setBlockColor(color);
        setProducer(producer);
        setLightTransmission(transmission);
    }

    public void printStatus() {
        super.printStatus();
        System.out.println("Manufactured by " + getProducer() + " on quality level " + getQuality());
    }
}
