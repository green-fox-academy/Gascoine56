package Minecraft;

public class Air extends Block {
    public static String[] blocks = {"Mud", "Brick", "Glass", "Door", "Window", "Gold"};

    public Air() {
        super("Air", "transparent", 100, true, blocks);
    }
}