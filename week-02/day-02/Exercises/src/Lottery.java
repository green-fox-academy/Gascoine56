import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
// Create a method that find the 5 most common lottery numbers in lottery.csv

public class Lottery {
    public static void main(String[] args) {
        Path x = Path.of("src/Lottery.csv");
        try {
            lotteryFinder(x);
        } catch (IOException e) {
            System.err.println("Failed to read file");
        }


    }

    private static void lotteryFinder(Path x) throws IOException {
        List<String> read = new ArrayList<>(Files.readAllLines(x));
        List<String> numbers = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < read.size(); i++) {
            String[] temp = read.get(i).split(";");
            for (int j = 11; j < temp.length; j++) {
                numbers.add(temp[j]);
            }

        }

        for (int i = 0; i < numbers.size(); i++) {
            if (!hm.containsKey(numbers.get(i))) {
                hm.put(numbers.get(i), 1);
            } else {
                hm.computeIfPresent(numbers.get(i), (k, v) -> v + 1);
            }
        }
        System.out.println(hm);
        String top1 = "";
        String top2 = "";
        String top3 = "";
        String top4 = "";
        String top5 = "";

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;

        for (String key : hm.keySet()) {
            if (hm.get(key) > count1) {
                count1 = hm.get(key);
                top1 = key;

            }
        }
        for (String key : hm.keySet()) {
            if (hm.get(key) > count2 && hm.get(key) < count1) {
                count2 = hm.get(key);
                top2 = key;

            }
        }
        for (String key : hm.keySet()) {
            if (hm.get(key) > count3 && hm.get(key) < count2) {
                count3 = hm.get(key);
                top3 = key;

            }
        }
        for (String key : hm.keySet()) {
            if (hm.get(key) > count4 && hm.get(key) < count3) {
                count4 = hm.get(key);
                top4 = key;

            }
        }
        for (String key : hm.keySet()) {
            if (hm.get(key) > count5 && hm.get(key) < count4) {
                count5 = hm.get(key);
                top5 = key;

            }
        }
        System.out.println(top1 + " - " + count1);
        System.out.println(top2 + " - " + count2);
        System.out.println(top3 + " - " + count3);
        System.out.println(top4 + " - " + count4);
        System.out.println(top5 + " - " + count5);
    }
}

