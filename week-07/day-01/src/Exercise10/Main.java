package Exercise10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Fox> foxes = new ArrayList<>();
        foxes.add(new Fox("Marigold", "brown", 3));
        foxes.add(new Fox("Lolira", "yellow", 25));
        foxes.add(new Fox("Opica", "brown", 15));
        foxes.add(new Fox("Marigold", "green", 3));
        foxes.add(new Fox("Samuel", "green", 10));
        foxes.add(new Fox("Marigold", "green", 185));

        foxes.stream().filter(x -> x.getColor().equals("green")).forEach(System.out::println);

        System.out.println("-------------------------------------------------------------------------------------------");

        foxes.stream().filter(x -> x.getColor().equals("green") && x.getAge() < 5).forEach(System.out::println);

        System.out.println("-------------------------------------------------------------------------------------------");

        System.out.println(foxes.stream().map(Fox::getColor).collect(Collectors.groupingBy(x -> x, Collectors.counting())));
    }
}