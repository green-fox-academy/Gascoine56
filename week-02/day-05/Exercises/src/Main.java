public class Main {

    public static void main(String[] args) {
        // Write a recursive function that takes one parameter: n and
        // adds numbers from 1 to n.
        int n = 10;
        System.out.println(add(n));
    }

    public static int add(int n) {
        if (n > 0) {
            return add(n - 1) + n;

        } else {
            return n;
        }

    }
}
