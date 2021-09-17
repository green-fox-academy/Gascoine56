public class Strings {
    // Given a string, compute recursively (no loops) a new string where
    // all the lowercase 'x' chars have been changed to 'y' chars.
    public static void main(String[] args) {
        String str = "krucifixove male deti s koaxialnym roxorom";
        int counter = 0;
        strings(str, counter);
    }
    public static void strings(String str, int counter){
        if (counter > str.length() -1){
            return;
        }
        else if(str.charAt(counter) == 'x' ){
            str = str.replace('x', 'y');
            System.out.print(str.charAt(counter));
            strings(str, counter + 1);
        }
        else{
            System.out.print(str.charAt(counter));
            strings(str, counter + 1);
        }
    }
}
