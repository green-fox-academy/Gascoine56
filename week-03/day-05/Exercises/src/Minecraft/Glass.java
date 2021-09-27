package Minecraft;

public class Glass extends Block {
    private static final int lightTransmission = 99;
    public static String[] blocks = {"Mud", "Brick", "Ice", "Air", "Glowstone", "Door"};

    public Glass(int lightTransmission, String color) {
        super("Glass", color, lightTransmission, false, blocks);
    }

    public Glass() {
        super("Glass", "transparent", lightTransmission, false, blocks);
    }
}