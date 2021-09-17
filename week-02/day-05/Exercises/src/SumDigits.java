public class SumDigits {
    // Given a non-negative integer n, return the sum of it's digits recursively
    // (without loops).
    //
    // Hint
    //
    // Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
    //
    // Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).

    public static void main(String[] args) {
        int i = 2568;
        System.out.println(sumDigits (i));
    }
    public static int sumDigits (int x){
        if(x < 1){
            return 0;
        }
        else{  return (x % 10) + sumDigits(x / 10);
        }
    }
}
