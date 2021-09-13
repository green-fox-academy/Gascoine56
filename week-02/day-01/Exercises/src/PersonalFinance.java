import java.util.ArrayList;
import java.util.Arrays;

public class PersonalFinance {
    public static void main(String [] srgs){


        //We are going to represent our expenses in a list containing integers.
        //Create a list with the following items:
        //500, 1000, 1250, 175, 800 and 120
        //Create an application which prints out the answers to the following questions:

        ArrayList <Integer> fin = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));

        //How much did we spend?
        int sum = 0, min = fin.get(0), max = fin.get(0);
        for (int i: fin) {
            sum += i;
            if (i > max){
                max = i;
            }
            else if (i<min){
                min = i;
            }


        }
        System.out.println("We spent " + sum);
        //Which was our greatest expense?
        System.out.println("Lowest spending " + min);
        //Which was our cheapest spending?
        System.out.println("Highest spending " + max);
        //What was the average amount of our spendings?
        System.out.println("Average spending " + (sum/fin.size()));

    }
}
