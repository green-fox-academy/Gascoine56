public class StringsAgain {
    // Given a string,
    // compute recursively a new string where
    // all the 'x' chars have been removed.
    public static void main(String[] args) {
        String str = "coaxial";
        int counter = 0;
        stringsAgain(str, counter);
    }
    public static void stringsAgain(String str, int counter){
        if (counter > str.length() - 1){
            System.out.print("");
        }
        else if (str.charAt(counter) == 'x'){
            stringsAgain(str, counter + 1);
        }
        else{
            System.out.print(str.charAt(counter));
            stringsAgain(str, counter + 1);
        }
    }
}
