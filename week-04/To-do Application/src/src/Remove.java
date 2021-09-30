package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Remove {

    public void removeFromList(String input, Path path) {
        String sub = input.substring(3).replaceAll("\\s+", "");
        if (sub.matches("[0-9, /,]+")) {
            String[] str = sub.split(",");
            Arrays.sort(str);
            try {
                java.util.List<String> lines = Files.readAllLines(path);
                int mover = 0;
                for (String s : str) {
                    int index = Integer.parseInt(s);
                    lines.remove(index - 1 - mover);
                    mover += 1;
                }
                Files.write(path, lines);
            } catch (IOException e) {
                System.out.println("Failed reading file.");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Number is not on the list, please try it again. ");
            } catch (NumberFormatException e) {
                System.out.println("Unable to remove. Index has to be a number.");
            }
        } else {
            System.out.println("Wrong index given.");
        }
    }
}