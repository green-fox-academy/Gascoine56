package CountLetters;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {

    @Test
    void countLetters() {
        CountLetters x = new CountLetters();
        Map <Character, Integer> hm = Map.of(
                'a', 1,
                'b', 2,
                'c', 3,
                'd', 4
        );
        assertEquals(hm,x.countLetters("abbcccdddd"));
    }
}