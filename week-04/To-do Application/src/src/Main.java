package src;

import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("              Todo app");
        System.out.println("====================================");
        String[] argDescriptions = {" List all tasks", " Add a new task", " Set a task completed", " Remove a task by index", " Quit application"};

        while (true) {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i] + argDescriptions[i]);
            }
            System.out.println("Todo is awaiting your instructions :");
            String input = scanner.nextLine();
            //End program
            if (Objects.equals(input, "-q")) {
               Quit quit = new Quit();
               quit.quit();
                //List function
            } else if (Objects.equals(input, "-l")) {
                List list = new List();
                list.listAllTasks();
                //Add function
            } else if (input.charAt(0) == '-' && input.charAt(1) == 'a') {
                if (input.length() == 2) {
                    System.out.println("Unable to add: No task provided");
                } else {
                    Add add = new Add();
                    add.addToList(input);
                }
            } else if (input.charAt(0) == '-' && input.charAt(1) == 'r') {
                if (input.length() == 2) {
                    System.out.println("Unable to remove: No index provided.");
                } else {
                    Remove rem = new Remove();
                    rem.removeFromList(input);
                }
                //Set completed
            } else if (input.charAt(0) == '-' && input.charAt(1) == 'c') {
                if (input.length() == 2) {
                    System.out.println("Unable to remove: No index provided.");
                }else {
                    Check c = new Check();
                    c.checkCompleted(input);
                }
            }
            //If command unknown
            else {
                System.out.println("Unknown command");
            }
        }
    }
}
