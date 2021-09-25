package Minecraft;

public class Lava extends Block{
    public static String [] blocks = {"Mud", "Brick", "Glass", "Ice", "Air", "Glowstone"};
    public Lava() {
        super("Lava", "Yellow", 170, crossable, blocks);
    }
    //it can transform its neighbor (the already existing block they are placed next to)
    //changes mud to brick and ice to air
}
