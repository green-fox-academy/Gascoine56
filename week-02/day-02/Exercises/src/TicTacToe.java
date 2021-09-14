import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicTacToe {
    public static void main(String[] args) {
        Path x = Path.of("src/owin.txt");

        try {
            ticTacResult(x);
        } catch (IOException e) {
            e.printStackTrace();
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
        else if()































    }


}
