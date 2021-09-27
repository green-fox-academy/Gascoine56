package Minecraft;

import java.util.ArrayList;
import java.util.List;

public class GlowStone extends Block {
    private static final String[] blocks = {"Glass", "Ice", "Air", "Lava"};
    private static final ArrayList<String> transformsFrom = new ArrayList<>(List.of("Glass"));

    public GlowStone(boolean transform) {
        super("Glowstone", "white", 300, false, blocks, transformsFrom);
        setTransform(transform);
    }

    public void transform(ArrayList wall, String x) {
        if (x.equals("Glass")) {
            wall.add(new Gold(160));
        }
    }

    public void printStatus() {
        super.printStatus();
        if (!getTransform()) {
            System.out.println("No transformation made");
        } else if (getTransform()) {
            System.out.println("Transformed block of Glass to Gold.");
        }
    }
}