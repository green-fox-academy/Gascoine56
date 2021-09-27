package Sum;

import java.util.ArrayList;

public class Sum {
    ArrayList<Integer> arr = new ArrayList<>();

    public Integer sum() {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    public void add(int x) {
        arr.add(x);
    }
}