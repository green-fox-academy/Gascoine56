package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Remove {

    public void removeFromList(String input){
        Path path = Paths.get("src/src/TasksDatabase.txt");
        String str = input.replaceAll("[^0-9]", "");
        try {
            int index = Integer.parseInt(str);
            java.util.List<String> lines = Files.readAllLines(path);
            lines.remove(index - 1);
            Files.write(path, lines);
        } catch (IOException e) {
            System.out.println("Failed reading file.");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Number is not on the list, please try it again. ");
        }catch (NumberFormatException e){
            System.out.println("Unable to remove. Index has to be a number.");
        }
    }

}
