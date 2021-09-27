package Minecraft;

import java.util.ArrayList;
import java.util.List;

public class Lava extends Block {
    private static final String[] blocks = {"Mud", "Brick", "Glass", "Ice", "Air", "Glowstone"};
    private static final ArrayList<String> transformsFrom = new ArrayList<>(List.of("Mud", "Ice"));
    public int transformedStatus = 0;

    public Lava(boolean transform) {
        super("Lava", "Yellow", 170, false, blocks, transformsFrom);
        setTransform(transform);
    }

    public void transform(ArrayList wall, String x) {
        if (x.equals("Mud")) {
            wall.add(new Brick());
            this.transformedStatus = 1;
        } else if (x.equals("Ice")) {
            wall.add(new Air());
            this.transformedStatus = 2;
        }
    }

    public void printStatus() {
        super.printStatus();
        if (this.transformedStatus == 1) {
            System.out.println("Transformed Mud block to Brick");
        } else if (this.transformedStatus == 2) {
            System.out.println("Transformed block of Ice to Air.");
        } else {
            System.out.println("Made no transformation");
        }
    }
}