package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Add{
    public void addToList(String input, Path path) {
        String [] str = input.substring(2).split(",");
        try {
            for (int i = 0; i < str.length; i++) {
                Files.writeString(path, "[ ]" + str[i] + System.lineSeparator(), StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            System.out.println("Can not find the database file. Task not recorded.");
        }
    }
}