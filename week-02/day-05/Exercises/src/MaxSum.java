public class MaxSum {
    // Create a function called `maxSum` which
    // expects an array of five integers as an input parameter and
    // returns the maximum values that can be
    // calculated by summing exactly four of the five integers.
    //
    // Examples
    //
    // [1 2 3 4 5] -> 14
    //
    // We can calculate the following sums using four of the five integers:
    //
    // 1 + 2 + 3 + 4 = 10
    // 1 + 2 + 3 + 5 = 11
    // 1 + 2 + 4 + 5 = 12
    // 1 + 3 + 4 + 5 = 13
    // 2 + 3 + 4 + 5 = 14
    public static void main(String[] args) {
        int [] arr = {5, 2, 3, 4, 5};
        int counter = 0;
        int sum = 0;
        System.out.println(maxSum(arr, counter, sum));
    }

    private static int maxSum(int[] arr, int counter, int sum) {
        if(counter >= arr.length){
            return sum;
        }
        else{
            int temp = 0;
            for (int i = 0; i < arr.length; i++) {
                int x = arr[i];
                temp += x;
            }
            temp -= arr[counter];
            if(temp > sum){
                sum = temp;
            }
            return maxSum(arr, counter +1, sum);

        }
    }

}
