public class GreatestCommonDivisor {
    // Find the greatest common divisor of two numbers using recursion.
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int divider = x;
        System.out.println("Greatest common divisor of " + x + " and " + y + " is " + greatestDivider(x, y, divider));
    }
    public static int greatestDivider(int a, int b, int divider){
        if (a == 0 || b == 0){
            return 0;
        }
        else if(a % divider == 0 && b % divider == 0){
            return divider;
        }
        else{
            return greatestDivider(a, b, divider -1);
        }
    }
}
