package Sum;

import Sum.Sum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SumTest {

    @Test
    void sum() {
        Sum x = new Sum();
        x.add(5);
        x.add(10);
        x.add(15);
        assertEquals(30, x.sum());
    }

    @Test
    void sum2() {
        Sum x = new Sum();
        assertEquals(0, x.sum());
    }

    @Test
    void sum3() {
        Sum x = new Sum();
        x.add(78);
        assertEquals(78, x.sum());
    }

    @Test
    void sum4() {
        Sum x = new Sum();
        assertNull(x.sum());
    }
}