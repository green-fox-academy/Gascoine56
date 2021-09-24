package ParkingLot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            cars.add(new Car());
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (Car car : cars) {
            map.putIfAbsent(car.type, 1);
            map.put(car.type, map.get(car.type) + 1);
        }
        System.out.println(map);
        HashMap<String, Integer> map2 = new HashMap<>();
        for (Car car : cars) {
            map2.putIfAbsent(car.color, 1);
            map2.put(car.color, map2.get(car.color) + 1);
        }
        System.out.println(map2);
        String[] arr = new String[cars.size()];
        for (int i = 0; i < cars.size(); i++) {
            arr[i] = cars.get(i).color.toString() + " " + cars.get(i).type.toString();
        }
        Arrays.sort(arr);
        int counter = 0;
        int temp = 0;
        String top = "";
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i].equals(arr[i - 1])) {
                temp++;
            } else if (i > 0 && !arr[i].equals(arr[i - 1]) && temp > counter) {
                counter = temp;
                temp = 0;
                top = arr[i - 1];
            }
        }
        System.out.println(counter);
        System.out.println(top);
    }
}


