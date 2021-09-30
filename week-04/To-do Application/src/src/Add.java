package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Add {

    public void addToList(String input) {
        Path path = Paths.get("src/src/TasksDatabase.txt");
        String str = input.substring(2);
        try {
            Files.writeString(path, "[ ]" + str + System.lineSeparator(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Can not find the database file. Task not recorded.");
            ;
        }
    }
}