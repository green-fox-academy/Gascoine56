import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Arrays;

public class Anagram {
    //Create a function named isAnagram() following your current language's style guide.
    // It should take two strings and return a boolean value depending on whether it's an anagram or not.
    public static void main(String [] args){
        String a = "green";
        String b = "fox";

        System.out.println(isAnagram(a,b));

    }
    public static boolean isAnagram(String a, String b){
        char []arrayA = new char [a.length()];
        char []arrayB = new char [b.length()];


        boolean result = false;
        if(arrayA.length == arrayB.length){
            for (int i = 0; i < arrayA.length; i++) {
                arrayA[i] = a.charAt(i);
                arrayB[i] = b.charAt(i);

            }
            Arrays.sort(arrayA);
            Arrays.sort(arrayB);
            for (int i = 0; i < arrayA.length; i++) {
                if( arrayA[i] == arrayB[i]){
                    result = true;
                }
                else{
                    result = false;
                    break;
                }
            }


        }
        System.out.println(Arrays.toString(arrayA));
        System.out.println(Arrays.toString(arrayB));
        return result;



    }



}
