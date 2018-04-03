package pl.codewars.kata7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelsTest {
    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
    }

    @Test
    public void testCase2() {
        assertEquals("Nope!", 5, Vowels.getCount("abrac adabra"));
    }

    @Test
    public void testCase3() {
        assertEquals("Nope!", 7, Vowels.getCount("  asdad abracadabra "));
    }
}
