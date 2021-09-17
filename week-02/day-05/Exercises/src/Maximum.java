public class Maximum {
    // Write a function that finds the largest element of an array using recursion.
    public static void main(String[] args) {
        int [] arr = {0,35654561,5,9,4,7,45,65,32154,7,33555};
        int max = 0;
        int counter = 0;
        maximum(arr,counter, max);

    }
    public static void maximum(int[] x, int counter, int max) {
        if (counter >= x.length) {
            System.out.println(max);
        }
        else if (x[counter] > max) {
                max = x[counter];
                maximum(x, counter+1, max);
        }
        else{
            maximum(x, counter+1, max);
        }
    }
    }


