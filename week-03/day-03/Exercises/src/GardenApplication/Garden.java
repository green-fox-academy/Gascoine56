package GardenApplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    public static void main(String[] args) {
        List<Plant> garden = new ArrayList<>();
        garden.add(new Flower("blue"));
        garden.add(new Flower("yellow"));
        garden.add(new Tree("purple"));
        garden.add(new Tree("orange"));

        double counter = 0;

        for (int i = 0; i < garden.size(); i++) {
            if (garden.get(i).getWaterNeed()) {
                System.out.println("The " + garden.get(i).getColor() + " " + garden.get(i).getType() + " needs water.");
                counter++;
            } else {
                System.out.println("The " + garden.get(i).getColor() + " " + garden.get(i).getType() + " does not need water.");
            }
        }

        for (int i = 0; i < garden.size(); i++) {
            if (garden.get(i).getWaterNeed()) {
                garden.get(i).waterIt(40, counter);
                garden.get(i).waterNeedCheck();
            }

        }
        counter = 0;
        System.out.println(" ");
        System.out.println("Watering with 40");

        for (int i = 0; i < garden.size(); i++) {
            if (garden.get(i).getWaterNeed()) {
                System.out.println("The " + garden.get(i).getColor() + " " + garden.get(i).getType() + " needs water.");
                counter++;
            } else {
                System.out.println("The " + garden.get(i).getColor() + " " + garden.get(i).getType() + " does not need water.");
            }
        }
        System.out.println(" ");
        System.out.println("Watering with 70");
        for (int i = 0; i < garden.size(); i++) {
            if (garden.get(i).getWaterNeed()) {
                garden.get(i).waterIt(70, counter);
                garden.get(i).waterNeedCheck();
            }

        }
        for (int i = 0; i < garden.size(); i++) {
            if (garden.get(i).getWaterNeed()) {
                System.out.println("The " + garden.get(i).getColor() + " " + garden.get(i).getType() + " needs water.");
                counter++;
            } else {
                System.out.println("The " + garden.get(i).getColor() + " " + garden.get(i).getType() + " does not need water.");
            }
        }
    }
}
