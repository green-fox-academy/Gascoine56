import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
    public static void main(String [] args){
        //We are going to represent our products in a map where the keys are strings representing the product's name and the values are numbers representing the product's price.
        //
        //Create a map with the following key-value pairs:
        HashMap <String, Integer> products = new HashMap<>();
        products.put("Eggs", 200);
        products.put("Milk", 200);
        products.put("Fish", 400);
        products.put("Apples", 150);
        products.put("Bread", 50);
        products.put("Chicken", 550);

        //Create an application which prints out the answers to the following questions:

        //How much is the fish?
        System.out.println(products.get("Fish"));
        //What is the most expensive product?
        //What is the average price?

        int max = 0;
        double sum = 0;
        String result = "";
        for (Map.Entry <String, Integer> x : products.entrySet()) {
            sum += x.getValue();
            if( x.getValue() > max){
                max = x.getValue();
                result = x.getKey();


            }


        }
        System.out.println(result);
        System.out.println(sum/products.size());

        //How many products' price is below 300?
        //Is there anything we can buy for exactly 125?
        int counter = 0;
        boolean exact = false;
        for (Map.Entry <String, Integer> x : products.entrySet()) {
            if( x.getValue() < 300){
                counter ++;


            }
            if(x.getValue() == 125){
                exact = true;
            }

        }
        System.out.println(counter);
        System.out.println(exact);
        //What is the cheapest product?
        int min = max;
        String minName = "";
        for (Map.Entry <String, Integer> x : products.entrySet()) {
            if(min > x.getValue()){
                min = x.getValue();
                minName = x.getKey();
            }

        }
        System.out.println(minName);

        //Which products cost less than 201? (just the name)


        for (Map.Entry <String, Integer> x : products.entrySet()) {
            if( x.getValue() < 201){
                System.out.print(x.getKey() + ", ");
            }
        }
        System.out.println();
        //Which products cost more than 150? (name + price)
        for (Map.Entry <String, Integer> x : products.entrySet()) {
            if( x.getValue() > 150){
                System.out.print(x.getKey() + " " + x.getValue() + ", ");
            }
        }



    }
}
