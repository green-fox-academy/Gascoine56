public class BunniesAgain {
    public static void main(String[] args) {
    // We have bunnies standing in a line,
    // numbered 1, 2, 3, 4, ...
    // The odd bunnies (1, 3, ...) have the normal 2 ears.
    // The even bunnies (2, 4, ..) we'll say have 3 ears,
    // because they each have a raised foot.
    // Recursively return the number of "ears" in
    // the bunny line 1, 2, ... n (without loops or multiplication).
        int bunnies = 200;
        System.out.println(bunniesAgain(bunnies));
    }
    public static int bunniesAgain(int bunnies) {
        if (bunnies < 1) {
            return 0;
        }
        else if (bunnies % 2 == 0) {
            return bunniesAgain(bunnies - 1) + 3;
        }
        else {
            return bunniesAgain(bunnies - 1) + 2;
        }
    }
}
