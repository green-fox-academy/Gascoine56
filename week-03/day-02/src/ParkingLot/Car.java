package ParkingLot;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Car {
    String color;
    String type;
    CarTypes [] carTypes = CarTypes.values();
    Colors [] colors = Colors.values();

    public Car() {
        Random ran = new Random();
        int x = ran.nextInt(carTypes.length);
        this.type = carTypes[x].toString();
        Random random = new Random();
        int y = random.nextInt(colors.length);
        this. color = colors[y].toString();
    }
}
