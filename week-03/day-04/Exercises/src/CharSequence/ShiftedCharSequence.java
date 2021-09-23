package CharSequence;

public class ShiftedCharSequence implements CharSequence {
    String str;

    public ShiftedCharSequence(String str, int shift) {
        this.str = str;
        this.str = this.str.substring(shift);
    }

    @Override
    public int length() {
        return str.length();
    }

    @Override
    public char charAt(int index) {
        return this.str.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
