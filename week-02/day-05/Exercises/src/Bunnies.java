public class Bunnies {
    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears
    // across all the bunnies recursively (without loops or multiplication).
    public static void main(String[] args) {
        int numberofBunnies = 50;
        System.out.println(bunnies(numberofBunnies));
    }
    public static int bunnies(int number){
        if (number < 1){
            return 0;
        }
        else{
            return 2 + bunnies(number-1);
        }
    }
}
