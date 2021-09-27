package CountLetters;

import java.util.HashMap;

public class CountLetters {
    public HashMap <Character, Integer> countLetters(String str){
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
            }else{
                hm.put(str.charAt(i),1);
            }
        }
        return hm;
    }

}
