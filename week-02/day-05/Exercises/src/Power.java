public class Power {
    // Given base and n that are both 1 or more, compute recursively (no loops) the
    // value of base to the n power, so powerN(3, 2) is 9 (3 squared).
    public static void main(String[] args) {
        int n = 3;
        int y = 3;
        System.out.println(power(n, y));
    }
    public static int power (int n, int y){
        if (n > 0 && y > 0){
            return power(n,y-1) *n;
            }
        else{
            return 1;
        }
    }
}
