package Minecraft;

public class Ice extends Block{
    public static String [] blocks = {"Mud", "Brick", "Glass", "Lava", "Air", "Glowstone"};

    public Ice() {
        super("Ice", "transparent", 97, false, blocks);
    }
    //it can transform its neighbor (the already existing block they are placed next to)
    //changes lava to glass
}
