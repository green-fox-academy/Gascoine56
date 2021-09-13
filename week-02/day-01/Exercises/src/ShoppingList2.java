import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ShoppingList2 {
    public static void main(String [] args){
        //Represent the following products with their prices:
        HashMap <String, Double> prices = new HashMap<>();

        prices.put("Milk", 1.07);
        prices.put("Rice", 1.59);
        prices.put("Eggs", 3.14);
        prices.put("Cheese", 12.60);
        prices.put("Chicken Breasts", 9.40);
        prices.put("Apples", 2.31);
        prices.put("Tomato", 2.58);
        prices.put("Potato", 1.75);
        prices.put("Onion", 1.10);

        //Represent Bob's shopping list:

        HashMap <String, Integer> bobList = new HashMap<>();
        bobList.put("Milk", 3);
        bobList.put("Rice", 2);
        bobList.put("Eggs", 2);
        bobList.put("Cheese", 1);
        bobList.put("Chicken Breasts", 4);
        bobList.put("Apples", 1);
        bobList.put("Tomato", 2);
        bobList.put("Potato", 1);

        //Represent Alice's shopping list:

        HashMap <String, Integer> aliceList = new HashMap<>();
        aliceList.put("Rice", 1);
        aliceList.put("Eggs", 5);
        aliceList.put("Chicken Breasts", 2);
        aliceList.put("Apples", 1);
        aliceList.put("Tomato", 10);

        //Create an application which prints out the answers to the following questions:
        //
        //How much does Bob pay?
        double sumBob = 0;
        for (Map.Entry <String, Double> x : prices.entrySet()){
            for ( Map.Entry <String, Integer> y : bobList.entrySet()){
                if(x.getKey() == y.getKey()){
                    sumBob += x.getValue() * y.getValue();
                }
            }
        }
        System.out.println(sumBob);

        //How much does Alice pay?
        double sumAlice = 0;
        for (Map.Entry <String, Double> x : prices.entrySet()){
            for ( Map.Entry <String, Integer> y : aliceList.entrySet()){
                if(x.getKey() == y.getKey()){
                    sumAlice += x.getValue() * y.getValue();
                }
            }
        }
        System.out.println(sumAlice);

        //Who buys more Rice?

        if(aliceList.get("Rice") > bobList.get("Rice")){
            System.out.println("Alice buys more rice.");

        }
        else if(aliceList.get("Rice") < bobList.get("Rice")) {
            System.out.println("Bob buys more rice.");
        }
        else System.out.println("They buy the same amount");

        //Who buys more Potato?

        if(aliceList.containsKey("Potato") == true && bobList.containsKey("Potato") == true) {
            if (aliceList.get("Potato") > bobList.get("Potato")) {
                System.out.println("Alice buys more potato.");

            } else if (aliceList.get("Potato") < bobList.get("Potato")) {
                System.out.println("Bob buys more potato.");
            } else System.out.println("They buy the same amount");
        }
        else if (aliceList.containsKey("Potato") == false){
            System.out.println("Bob buys more potato.");
        }
        else if (bobList.containsKey("Potato") == false){
            System.out.println("Bob buys more potato.");
        }

        //Who buys more different products?
        if(aliceList.size() > bobList.size()){
            System.out.println("Alice buys more different products");
        }
        else if(aliceList.size() < bobList.size()){
            System.out.println("Bob buys more different products");
        }
        else{
            System.out.println("They buy same amount of different products");
        }

        //Who buys more products? (more pieces)
        int counterAlice = 0;
        int counterBob  = 0;

        for (Map.Entry <String,Integer> x : aliceList.entrySet()) {
            counterAlice += x.getValue();
        }
        for (Map.Entry <String, Integer> x : bobList.entrySet()) {
            counterBob += x.getValue();
        }
        if(counterAlice > counterBob){
            System.out.println("Alice buys more products");
        }
        else if(counterAlice < counterBob){
            System.out.println("Bob buys more products");
        }
        else{
            System.out.println("They buy same amount of products");
        }







    }
}
