package Fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void fibonacci() {
        assertEquals(2, Main.fibonacci(3));
    }
    @Test
    void fibonacci2() {
        assertEquals(3, Main.fibonacci(4));
    }
}