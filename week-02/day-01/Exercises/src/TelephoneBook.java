import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    public static void main(String [] args){

        //We are going to represent our contacts in a map where both the keys and values are strings.

        HashMap <String,String> phoneBook = new HashMap<>();

        phoneBook.put("William A. Lathan", "405-709-1865");
        phoneBook.put("John K. Miller", "402-247-8568");
        phoneBook.put("Hortensia E. Foster", "606-481-6467");
        phoneBook.put("Amanda D. Newland", "319-243-5613");
        phoneBook.put("Brooke P. Askew", "307-687-2982");

        //Create an application which prints out the answers to the following questions:
        //What is John K. Miller's phone number?
        System.out.println("John K. Miller number is " + phoneBook.get("John K. Miller"));
        //Whose phone number is 307-687-2982?
        //Do we know Chris E. Myers' phone number?
        for (Map.Entry <String,String> x : phoneBook.entrySet()) {
                if (x.getValue() == "307-687-2982"){
                    System.out.println(x.getKey());



            }
        }
        System.out.println(phoneBook.containsKey("Chris E. Myers"));





    }

}
