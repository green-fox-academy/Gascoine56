package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Check {
    public void checkCompleted(String input, Path path) {
        String sub = input.substring(3).replaceAll("\\s+", "");
        if (sub.matches("[0-9, /,]+")) {
            try {
                java.util.List<String> lines = Files.readAllLines(path);
                String[] split = sub.split(",");
                for (String str : split) {
                    int index = Integer.parseInt(str);
                    String replace = "[X]" + lines.get(index - 1).substring(3);
                    lines.set(index - 1, replace);
                }
                Files.write(path, lines);
            } catch (IOException e) {
                System.out.println("Failed reading file.");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Number is not on the list. ");
            } catch (NumberFormatException e) {
                System.out.println("Unable to remove. Index has to be a number.");
            }
        } else {
            System.out.println("Wrong index given.");
        }
    }
}
