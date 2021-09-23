package CharSequence;

import java.util.Arrays;

public class Gnirts implements CharSequence {
    String str;

    public Gnirts(String str) {

        StringBuilder x = new StringBuilder(str);
        x.reverse();
        this.str = x.toString();
    }

    @Override
    public int length() {
        return str.length();
    }

    @Override
    public char charAt(int index) {
        /*return str.charAt(str.length()-1-index);*/
        return str.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return str.subSequence(start, end);
    }
}
