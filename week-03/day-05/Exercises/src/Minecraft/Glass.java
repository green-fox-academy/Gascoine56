package Minecraft;

public class Glass extends Block {
    public static String [] blocks = {"Mud", "Brick", "Ice", "Air", "Glowstone", "Door"};
    public Glass(double lightTransmission, String color) {
        super("Glass", color,lightTransmission, false, blocks);
           }

    public Glass(double lightTransmission) {
        super("Glass", "transparent", lightTransmission, false, blocks);
    }
    //light transmission: can be defied at creation. When not given: 99%
}
