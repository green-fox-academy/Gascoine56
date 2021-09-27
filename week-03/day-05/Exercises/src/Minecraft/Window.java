package Minecraft;

public class Window extends Block {
    public static String[] blocks = {"Mud", "Brick", "Air", "Door", "Glowstone"};

    public Window(Quality quality, String producer, String color, int transmission, boolean crossable) {
        super("Window", blocks);
        setQuality(quality);
        setProducer(producer);
        setBlockColor(color);
        setLightTransmission(transmission);
        setCrossable(crossable);
    }

    public void printStatus() {
        super.printStatus();
        System.out.println("Manufactured by " + getProducer() + " on quality level " + getQuality());
    }
}
