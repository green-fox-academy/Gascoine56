package Apples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplesTest {

    @Test
    void getApple() {
        Apples x = new Apples();
        assertEquals("Apple", x.getApple());
    }
}