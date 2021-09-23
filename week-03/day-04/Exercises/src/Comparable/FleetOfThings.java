package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FleetOfThings {

    public static void main(String[] args) {
        // - You have the `Thing` class
        // - You have the `Fleet` class
        // - You have the `FleetOfThings` class with a `main()` method
        // - Download those, use those
        // - Create a fleet in the main() method

        Thing milk = new Thing("Get milk");
        Thing obst = new Thing("Remove the obstacles");
        Thing stand = new Thing("Stand up");
        Thing eat = new Thing("Eat lunch");

        List<Thing> todo = new ArrayList<>();
        todo.add(milk);
        todo.add(obst);
        todo.add(stand);
        todo.add(eat);
        stand.complete();
        eat.complete();

        // - Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Collections.sort(todo);
        System.out.println(todo);
    }
}
