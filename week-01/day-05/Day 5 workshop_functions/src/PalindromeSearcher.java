import java.util.Arrays;

public class PalindromeSearcher {
    //Create a function named searchPalindrome() following your current language's style guide.
    //It should take a string, search for palindromes that is at least 3
    // characters long and return a list with the found palindromes.
    public static void main(String [] args){

        String testedString = "racecar";
        palindromes(testedString);


    }
    public static void palindromes (String palindrome){
        char array[] = new char [palindrome.length()];
        for (int i = 0; i < palindrome.length(); i++) {
            array[i] = palindrome.charAt(i);
        }
        int counter = 0;
        String palindromeOut[] = new String [array.length];

        for (int i = 0; i < array.length ; i++) {
            for (int j = 1; j < array.length; j++) {
                if(i-j >= 0 && i+j < array.length && array[i-j] == array[i+j]){
                    char arrayTemp[] = Arrays.copyOfRange(array,i-j,i+j+1);
                    String pal = Arrays.toString(arrayTemp);
                    palindromeOut[counter] = pal;

                }
                else if((i-j >= 0 && i+j < array.length && i+j+1 < array.length && array[i-j] == array[i+j+1] && array[i] == array[i+j] )){
                    char arrayTemp[] = Arrays.copyOfRange(array, i-j,i+j+2);
                    String pal = Arrays.toString(arrayTemp);
                    palindromeOut[counter] = pal;
                }
                else{
                    break;
                }
                counter++;


            }

        }
        String palindromeOutA[] = Arrays.copyOfRange(palindromeOut, 0, counter);

        System.out.println(Arrays.deepToString(palindromeOutA));
    }
}
