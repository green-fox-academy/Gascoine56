import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
    public static void main(String [] args){
        //Create a map where the keys are strings and the values are strings with the following initial values
        HashMap <String, String> hm = new HashMap<>();
        hm.put("978-1-60309-452-8", "A letter to Joe");
        hm.put("978-1-60309-459-7", "Lupus");
        hm.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        hm.put("978-1-60309-461-0", "The Lab");

        //Print all the key-value pairs in the following format
        for (String x: hm.keySet()) {
            System.out.println(hm.get(x) + " (ISBN: " + x + ")");

        }
        //Remove the key-value pair with key 978-1-60309-444-3
        hm.remove("978-1-60309-444-3");

        //Add the following key-value pairs to the map
        hm.put("978-1-60309-450-4", "They Called Us Enemy");
        hm.put("978-1-60309-453-5", "Why Did We Trust Him?");

        //Print whether there is an associated value with key 478-0-61159-424-8 or not
        System.out.println(hm.containsKey(478-0-61159-424-8));

        //Print the value associated with key 978-1-60309-453-5
        System.out.println(hm.get(978-1-60309-453-5));






    }
}
