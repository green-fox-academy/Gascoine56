import java.sql.SQLOutput;
import java.util.Arrays;

public class SubInt {
    //  Create a function that takes a number and an array of integers as parameters
    //  It returns the indices of the integers of the array which contain the given number
    //  or returns an empty array (if the number is not part of any of the integers in the array)

    public static void main(String[] args) {
        String number = "6";
        int []array = {5,8,2,45,98,45,1687,15,654,1,64,321,687,45,75};

        subInt(number, array);



    }
    public static void subInt(String x, int []arr){
        int []newArray = new int [arr.length];
        int indexCounter = 0;
        System.out.print("[ ");
        for (int i = 0; i < arr.length ; i++) {
            String b = Integer.toString(arr[i]);
            if(b.contains(x)){
                System.out.print(i + ", ");
            }

        }
        System.out.print("]");






    }
}
