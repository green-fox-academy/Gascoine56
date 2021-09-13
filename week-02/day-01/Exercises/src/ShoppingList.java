import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String [] args){

        //Create a list with the following items:
        //"eggs", "milk", "fish", "apples", "bread" and "chicken"

        ArrayList <String> shoppingList = new ArrayList<>(Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken"));

        //Create an application which prints out the answers to the following questions:

        //Do we have milk on the list?
        System.out.println("Do we have milk on the list");
        System.out.println(shoppingList.contains("milk"));
        //Do we have bananas on the list?
        System.out.println("Do we have bananas on the list");
        System.out.println(shoppingList.contains("bananas"));
    }
}
