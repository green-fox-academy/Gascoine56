package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Add {
    public void addToList(String input, Path path) {
        String[] str = input.substring(2).split(",");
        try {
            for (String s : str) {
                Files.writeString(path, "[ ]" + s + System.lineSeparator(), StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            System.out.println("Can not find the database file. Task not recorded.");
        }
    }
}