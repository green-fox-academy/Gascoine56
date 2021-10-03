package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class List {
    public void listAllTasks(String input, Path path) {
        System.out.println(input);
        try {
            java.util.List<String> lines = Files.readAllLines(path);
            if (lines.size() == 0) {
                System.out.println("No todos for today! :)");
            } else {
                if (input.length() == 3 && input.charAt(2) == 'a') {
                    for (int i = 0; i < lines.size(); i++) {
                        System.out.println((i + 1) + " - " + lines.get(i));
                    }
                } else if (input.length() == 2) {
                    for (int i = 0; i < lines.size(); i++) {
                        if (lines.get(i).charAt(1) != 'X')
                            System.out.println((i + 1) + " - " + lines.get(i));
                    }
                } else {
                    System.out.println("Unknown command");
                }
            }
        } catch (IOException e) {
            System.out.println("File not found.");
        }
    }
}