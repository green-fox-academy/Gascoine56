package Minecraft;

public class Window extends  Block {
    public static String [] blocks = {"Mud", "Brick", "Air", "Door", "Glowstone"};

    public Window(Quality quality, String producer, String color, double transmission, boolean crossable) {
        super("Window", blocks);
        setQuality(quality);
        setProducer(producer);
        setBlockColor(color);
        setLightTransmission(transmission);
        setCrossable(crossable);

    }
}
