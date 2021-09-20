package Farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<Animal> farm = new ArrayList<>();
    private int farm_size = 10;

    public void breed() {
        if (farm.size() < farm_size) {
            farm.add(new Animal());
        } else {
            System.out.println("Farm is full");
        }
    }

    public void sell() {
        int lowest_hunger = 0;
        int sellIndex = 0;
        for (int i = 0; i < farm.size(); i++) {
            if (farm.get(i).getHunger() < lowest_hunger) {
                lowest_hunger = farm.get(i).getHunger();
                sellIndex = i;
            }
        }
        farm.remove(farm.get(sellIndex));
    }
}
