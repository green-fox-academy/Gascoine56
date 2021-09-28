package Sharpie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharpieTest {

    @Test
    void use() {
        Sharpie x = new Sharpie();
        assertEquals(50, x.use());
    }

    @Test
    void getInkAmount() {
        Sharpie x = new Sharpie();
        assertEquals(100, x.getInkAmount());
    }
}