package Minecraft;

public class Door extends Block{
    public static String [] blocks = {"Mud", "Brick", "Air", "Window"};
    public Door(Quality quality, String producer, String color, double transmission){
        super("Door",true,blocks);
        setQuality(quality);
        setBlockColor(color);
        setProducer(producer);
        setLightTransmission(transmission);
    }
}
