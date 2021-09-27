package Minecraft;

public class Ma {
    public static void main(String[] args) {
        Wall wall = new Wall();
        wall.placeBlock(new Air());
        wall.placeBlock(new Brick("dark gray"));
        wall.placeBlock(new Door(Quality.TWO, "Mordor", "black", 60));
        wall.placeBlock(new Glass());
        wall.placeBlock(new GlowStone(true));
        wall.placeBlock(new Window(Quality.ONE, "Liliput", "white", 70, true));
        wall.placeBlock(new Window(Quality.TWO, "Asgard", "light gray", 90, true));
        wall.placeBlock(new Mud());
        wall.placeBlock(new Gold(50));
        wall.placeBlock(new Lava(true));
        wall.placeBlock(new GlowStone(true));
        wall.placeBlock(new Ice(true));
        wall.placeBlock(new Lava(true));
        wall.placeBlock(new Gold(30));
        wall.placeBlock(new Ice(true));
        System.out.println();
        wall.calculateLightTransmission();
        System.out.println();
        wall.printStatus();
    }
}