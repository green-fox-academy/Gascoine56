package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class List {
    Path path = Paths.get("src/src/TasksDatabase.txt");

    public void listAllTasks(String input) {
        try {
            java.util.List<String> lines = Files.readAllLines(path);
            if (lines.size() == 0) {
                System.out.println("No todos for today! :)");
            } else {
                if (input.length() == 3 && input.charAt(2) == 'a') {
                    for (int i = 0; i < lines.size(); i++) {
                        System.out.println((i + 1) + " - " + lines.get(i));
                    }
                } else {
                    for (int i = 0; i < lines.size(); i++) {
                        if (lines.get(i).charAt(1) != 'X')
                            System.out.println((i + 1) + " - " + lines.get(i));
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("File not found.");
        }
    }
}