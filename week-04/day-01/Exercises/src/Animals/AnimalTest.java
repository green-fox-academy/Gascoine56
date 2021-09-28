package Animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    Animal animal = new Animal();
    @Test
    void eat() {
        animal.eat();
        assertEquals(49,animal.getHunger());
    }

    @Test
    void drink() {
        animal.drink();
        assertEquals(49, animal.getThirst());
    }

    @Test
    void play() {
        animal.play();
        assertEquals(51, animal.getThirst());
        assertEquals(51, animal.getHunger());
    }
}