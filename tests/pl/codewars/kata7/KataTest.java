package pl.codewars.kata7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {

    @Test
    public void kataTest(){
        assertEquals(Kata.getMiddle("test"), "es");
        assertEquals(Kata.getMiddle("testing"), "t");
        assertEquals(Kata.getMiddle("middle"), "dd");
        assertEquals(Kata.getMiddle("A"), "A");
    }
}
