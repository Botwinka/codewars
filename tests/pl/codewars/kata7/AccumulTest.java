package pl.codewars.kata7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccumulTest {

    @Test
    public void accumulTest(){
        assertEquals(Accumul.accum("abcd"), "A-Bb-Ccc-Dddd");
        assertEquals(Accumul.accum("RqaEzty"), "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy");
        assertEquals(Accumul.accum("cwAt"), "C-Ww-Aaa-Tttt");
    }
}
