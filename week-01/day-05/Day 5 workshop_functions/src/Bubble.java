import java.util.Arrays;

public class Bubble {
    //  Create a function that takes an array of numbers as parameter
    //  and returns an array where the elements are sorted in ascending numerical order
    //  When you are done, add a second boolean parameter to the function
    //  If it is `true` sort the array descending, otherwise ascending
    public static void main(String [] args){
        int []array = {34, 12, 24, 9, 5};
        boolean bol = true;

        blob(array, bol);

    }

    public static void blob(int x[], boolean y){
        Arrays.sort(x);
        if(y == true){
            int z[] = new int[x.length];
            for (int i = x.length-1; i >= 0; i--) {
                z[i] = x[x.length-i-1];

            }
            System.out.println(Arrays.toString(z));

        }
        else{
            System.out.println(Arrays.toString(x));
        }





    }
}
