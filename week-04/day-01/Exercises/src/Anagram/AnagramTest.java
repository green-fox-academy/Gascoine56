package Anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void isAnagram() {
        Anagram x = new Anagram();
        assertTrue(x.isAnagram("oko", "oko"));
    }

    @Test
    void isAnagram1() {
        Anagram x = new Anagram();
        assertFalse(x.isAnagram("sdfgsdg", "oko"));
    }

    @Test
    void isAnagram2() {
        Anagram x = new Anagram();
        assertFalse(x.isAnagram("afr", "afr"));
    }
}