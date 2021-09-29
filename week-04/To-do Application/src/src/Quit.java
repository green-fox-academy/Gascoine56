package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Quit {
    Path path = Paths.get("src/src/TasksDatabase.txt");
    java.util.List<String> lines;

    public void quit() {
        try {
            boolean allComplete = true;
            lines = Files.readAllLines(path);
            for (String line : lines) {
                if (line.charAt(1) == ' ') {
                    allComplete = false;
                    break;
                }
            }
            if (lines.isEmpty() | allComplete) {
                System.out.println("Great job, no task left for today. You can have a beer, cheers! ");
                System.exit(130);
            } else {
                System.out.println("You still have so much to do, are you sure you want to quit? (y/n)");
                Scanner scanner = new Scanner(System.in);
                String x = scanner.next();
                if (x.equals("y")) {
                    System.exit(130);
                } else if (x.equals("n")) {
                    System.out.println("Excellent, let's continiue!");
                } else {
                    System.out.println("Unrecognized input");
                }
            }
        } catch (IOException e) {
            System.out.println("Failed reading file.");
        }
    }

}
