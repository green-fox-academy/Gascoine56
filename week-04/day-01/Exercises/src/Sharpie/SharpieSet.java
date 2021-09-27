package Sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> sharpies = new ArrayList<>();

    public void add(Sharpie x) {
        sharpies.add(x);
    }

    public int countUsable() {
        int counter = 0;
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).getInkAmount() > 0) {
                counter += 1;
            }
        }
        return counter;
    }

    public void removeTrash() {
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).getInkAmount() <= 0) {
                sharpies.remove(i);
            }
        }
    }
}