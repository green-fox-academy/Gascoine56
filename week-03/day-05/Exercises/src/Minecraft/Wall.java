package Minecraft;

import java.util.ArrayList;

public class Wall {
    ArrayList<Block> wall = new ArrayList<>();

    public void placeBlock(Block block) {
        if (wall.isEmpty()) {
            wall.add(block);
        } else {
            if (block.canPlaceAfter(wall.get(wall.size() - 1).getBlockType())) {
                if (block.getTransform() && block.getTransformsFrom().contains(wall.get(wall.size() - 1).getBlockType())) {
                    block.transform(wall, wall.get(wall.size() - 1).getBlockType());
                    wall.remove(wall.get(wall.size() - 2));
                }
                wall.add(block);
            } else {
                System.out.println("Block " + block.getBlockType() + (" can not be placed next to " + wall.get(wall.size() - 1).getBlockType()));
            }
        }
    }

    public void printStatus() {
        for (Block block : wall) {
            block.printStatus();
            System.out.println();
        }
    }

    public void calculateLightTransmission() {
        int lightAmount = 0;
        int count = 0;
        for (Block block : wall) {
            lightAmount += block.getLightTransmission();
            count += 1;
        }
        System.out.println("Light transmitted: " + lightAmount / count);
    }
}