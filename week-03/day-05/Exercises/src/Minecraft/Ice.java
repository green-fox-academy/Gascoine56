package Minecraft;

import java.util.ArrayList;
import java.util.List;

public class Ice extends Block {
    public static String[] blocks = {"Mud", "Brick", "Glass", "Lava", "Air", "Glowstone"};
    private static final ArrayList<String> transformsFrom = new ArrayList<>(List.of("Lava"));

    public Ice(boolean transform) {
        super("Ice", "transparent", 97, false, blocks, transformsFrom);
        setTransform(transform);
    }

    public void transform(ArrayList wall, String x) {
        wall.add(new Glass(99, "transparent"));
    }

    public void printStatus() {
        super.printStatus();
        if (!getTransform()) {
            System.out.println("No transformation made");
        } else if (getTransform()) {
            System.out.println("Transformed block of Lava to Glass.");
        }
    }
}