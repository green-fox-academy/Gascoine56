package src;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] checkArr = {"-l", "-la", "-a", "-c", "-r", "-q"};
        if (!Arrays.equals(args, checkArr)) {
            String input = Arrays.toString(args);
            Path path = Paths.get("C:\\Users\\Palo\\greenfox\\Gascoine56\\week-04\\To-do Application\\src\\src\\TasksDatabase.txt");
            if ((args[0].charAt(0) == '-' && (args[0].charAt(1) == 'l'))) {
                input = input.substring(1).replace("]", "");
                List list = new List();
                list.listAllTasks(input, path);
                //Add function
            } else if ((args[0].charAt(0) == '-' && (args[0].charAt(1) == 'a'))) {
                if ((args.length == 1)) {
                    System.out.println("Unable to add: No task provided");
                } else {
                    Add add = new Add();
                    input = input.substring(2).replace("]", "");
                    add.addToList(input, path);
                }
            } else if ((args[0].charAt(0) == '-' && (args[0].charAt(1) == 'r'))) {
                if ((args.length) == 1) {
                    System.out.println("Unable to remove: No index provided.");
                } else {
                    Remove rem = new Remove();
                    input = input.substring(1).replace("]", "");
                    rem.removeFromList(input, path);
                }
                //Set completed
            } else if ((args[0].charAt(0) == '-' && (args[0].charAt(1) == 'c'))) {
                if ((args.length == 1)) {
                    System.out.println("Unable to remove: No index provided.");
                } else {
                    Check c = new Check();
                    input = input.substring(1).replace("]", "");
                    System.out.println(input);
                    c.checkCompleted(input, path);
                }
            }
            //If command unknown
            else {
                System.out.println("Unknown command");
            }
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("              Todo app");
            System.out.println("====================================");
            String[] argDescriptions = {" List uncompleted tasks", " List all tasks", " Add new tasks, use , to separate multiple inputs", " Set a task completed", " Remove a task by index", " Quit application"};
            Path path = Paths.get("C:\\Users\\Palo\\greenfox\\Gascoine56\\week-04\\To-do Application\\src\\src\\TasksDatabase.txt");
            while (true) {
                for (int i = 0; i < args.length; i++) {
                    System.out.println(args[i] + argDescriptions[i]);
                }
                System.out.println("Todo is awaiting your instructions :");
                String input = scanner.nextLine();
                //End program
                if (Objects.equals(input, "-q")) {
                    Quit quit = new Quit();
                    quit.quit(path);
                    //List function
                } else if (input.charAt(0) == '-' && input.charAt(1) == 'l') {
                    List list = new List();
                    list.listAllTasks(input, path);
                    //Add function
                } else if (input.charAt(0) == '-' && input.charAt(1) == 'a') {
                    if (input.length() == 2) {
                        System.out.println("Unable to add: No task provided");
                    } else {
                        Add add = new Add();
                        add.addToList(input, path);
                    }
                } else if (input.charAt(0) == '-' && input.charAt(1) == 'r') {
                    if (input.length() == 2) {
                        System.out.println("Unable to remove: No index provided.");
                    } else {
                        Remove rem = new Remove();
                        rem.removeFromList(input, path);
                    }
                    //Set completed
                } else if (input.charAt(0) == '-' && input.charAt(1) == 'c') {
                    if (input.length() == 2) {
                        System.out.println("Unable to remove: No index provided.");
                    } else {
                        Check c = new Check();
                        c.checkCompleted(input, path);
                    }
                }
                //If command unknown
                else {
                    System.out.println("Unknown command");
                }
            }
        }
    }
}