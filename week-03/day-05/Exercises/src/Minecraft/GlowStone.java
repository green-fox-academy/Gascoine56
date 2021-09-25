package Minecraft;

public class GlowStone extends Block {
    public  static String [] blocks = {"Glass", "Ice", "Air", "Lava"};
    public GlowStone() {
        super("Glowstone", "white", 300, false, blocks);
    }
    //it can transform its neighbor (the already existing block they are placed next to)
    //transforms glass to gold (that has light transmission 160)
}
