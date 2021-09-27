package Minecraft;

public class Brick extends Block {
    public static String[] blocks = {"Mud", "Glass", "Air", "Door", "Window"};

    public Brick() {
        super("Brick", "rgb: 144, 76, 42", 0, false, blocks);
    }

    public Brick(String color) {
        super("Brick", 0, false, blocks);
        setBlockColor(color);
    }
}