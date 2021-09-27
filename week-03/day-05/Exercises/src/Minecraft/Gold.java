package Minecraft;

public class Gold extends Block {
    public static String[] blocks = {"Glowstone", "Glass"};

    public Gold(int lightTransmission) {
        super("Gold", "rgb: 255,215,0", false, blocks);
        setLightTransmission(lightTransmission);
    }
}