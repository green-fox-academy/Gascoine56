import java.util.Arrays;

public class Unique {
    //  Create a function that takes an array of numbers as a parameter
    //  and returns an array of integers where every integer is unique (occurs only once)

    public static void main(String [] args) {
        int[] array = {1,1,1,1,11, 11,5, 34, 11, 52, 61, 1, 34};
        findUniqueItems(array);
        System.out.println(Arrays.toString(findUniqueItems(array)));

    }
    public static int[] findUniqueItems(int [] arr){
       Arrays.sort(arr);
       int [] unique = new int [arr.length+1];
       int counter = 0;
       unique[0] = arr[0];
       for (int i = arr.length-1; i >= 0; i--) {
            if ((i-1>= 0 && arr[i] != arr[i-1])){
                unique[i+1] += arr[i];

            }
            else{
                counter ++;
                }

        }
       System.out.println(Arrays.toString(unique));
       Arrays.sort(unique);
       int []uniqueFinal = Arrays.copyOfRange(unique, counter, unique.length);;
       return uniqueFinal;





        }

}
