import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicTacToe {
    public static void main(String[] args) {
        Path x = Path.of("src/draw.txt");

        try {
            ticTacResult(x);
        } catch (IOException e) {
            System.err.println("Could not read file");;
        }

    }

    private static void ticTacResult(Path x) throws IOException {


        List <String> list = Files.readAllLines(x);

        for (String line: list) {
            if (line.equals("XXX")){
                System.out.println("X wins!");
            }
            else if(line.equals("OOO")) {
                System.out.println("O wins!");
            }
        }
        if(list.get(0).startsWith("O") && list.get(1).startsWith("O") && list.get(2).startsWith("O")){
            System.out.println("O wins!");
        }
        else if(list.get(0).startsWith("X") && list.get(1).startsWith("X") && list.get(2).startsWith("X")){
            System.out.println("X wins!");}
        else if(list.get(0).endsWith("X") && list.get(1).endsWith("X") && list.get(2).endsWith("X")){
            System.out.println("X wins!");}
        else if(list.get(0).endsWith("O") && list.get(1).endsWith("O") && list.get(2).endsWith("O")){
            System.out.println("O wins!");}
        else if(list.get(0).charAt(0) == 'O' && list.get(0).charAt(0) == list.get(1).charAt(1)
                && list.get(2).charAt(2) == list.get(0).charAt(0) && list.get(1).charAt(1) == list.get(2).charAt(2)){
            System.out.println("O wins!");}
        else if(list.get(0).charAt(0) == 'X' && list.get(0).charAt(0) == list.get(1).charAt(1)
                && list.get(2).charAt(2) == list.get(0).charAt(0) && list.get(1).charAt(1) == list.get(2).charAt(2)){
            System.out.println("X wins!");}
        else{
            System.out.println("Draw");
        }

































    }


}
