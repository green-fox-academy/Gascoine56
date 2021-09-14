import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
    // Create a method that decrypts the duplicated-chars.txt.
    // Decryption is the process reversing an encryption, i.e. the process
    // which converts encrypted data into its original form.
    public static void main(String[] args) {
        String x = "src/DoubledOriginal.txt";
        String y = "src/Doubled-fixed.txt";

        decryption(x,y);


    }

    public static void decryption(String readPath, String writePath){
        Path read = Path.of(readPath);
        Path write = Path.of(writePath);



        try{
            String temp = Files.readString(read);
            StringBuilder fin = new StringBuilder();
            fin.append(temp.charAt(0));


            for (int i = 0; i < temp.length(); i++) {
                if((i-1>0) && (temp.charAt(i) != temp.charAt(i-1))) {
                    fin.append(temp.charAt(i));

                }
            }
            String decrypted = fin.toString();
            Files.writeString(write, decrypted);
        }catch (IOException e){
            System.out.println("Can not read or write file");
            System.exit(2);
        }



    }
}
