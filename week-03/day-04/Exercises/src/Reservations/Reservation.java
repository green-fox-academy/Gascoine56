package Reservations;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Reservation implements Reservationy {
    @Override
    public String getDowBooking() {
        List <String> arr = new ArrayList<>();
        Random r = new Random();
        int x = r.nextInt(7);
        for (DOW d: DOW.values()) {
            arr.add(d.toString());
        }
        return arr.get(x);
    }

    @Override
    public String getCodeBooking() {
        String[] arr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int targetStringLength = 8;
        Random r = new Random();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < targetStringLength; i++) {
            str.append(arr[r.nextInt(arr.length - 1)]);
        }

        return str.toString();
    }
}
