package Anagram;

public class Anagram {

    public boolean isAnagram(String str1, String str2){
        if (str1.length() == str2.length()) {
            boolean x = false;
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == str2.charAt(str1.length() - i-1)){
                x = true;
                }else{
                    return false;
                }
            }
            return x;
        }else{
            return false;
        }

    }
}
