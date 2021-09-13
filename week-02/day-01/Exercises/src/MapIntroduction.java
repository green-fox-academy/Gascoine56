import java.util.HashMap;

public class MapIntroduction {
    public static void main(String [] args) {
        HashMap<Integer, Character> hm = new HashMap<Integer, Character>();

        System.out.println(hm.isEmpty());

        hm.put(97, 'a');
        hm.put(98, 'b');
        hm.put(99, 'c');
        hm.put(65, 'A');
        hm.put(66, 'B');
        hm.put(67, 'C');

        for (Integer i : hm.keySet()) {
            System.out.println(i);
        }

        for (Integer i: hm.keySet()) {
            System.out.println(hm.get(i));

        }
        hm.put(68, 'D');
        System.out.println(hm.size());

        System.out.println(hm.get(97));

        System.out.println(hm.containsKey(100));

        hm.clear();

    }
}
