package Pirates;

import java.util.Random;

public class Parrot {
    //Parrot can comment on the situation with one of 3 random phrases
    private String name;

    public Parrot(String name) {
        this.name = name;
    }

    public void comment() {
        Random x = new Random();
        int line = x.nextInt(4);
        switch (line) {
            case 1 -> System.out.println("Batten Down The Hatches");
            case 2 -> System.out.println("Blow The Man Down");
            case 3 -> System.out.println("Cleave Him to the Brisket");
        }

    }
}
