package CharSequence;

public class Main {
    public static void main(String[] args) {
        Gnirts str = new Gnirts("example");
        System.out.println(str.charAt(1));
        System.out.println(str.length());
        System.out.println(str.subSequence(2,6));

        ShiftedCharSequence shifted = new ShiftedCharSequence("example", 2);
        System.out.println(shifted.charAt(2));
    }
}
