package pl.codewars.kata8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MultiplyTest {
    private static final double DELTA = 1e-15;

    @Test
    public void isEqual() {
        assertEquals(Multiply.multiply(5.00, 9.00), 45.00, DELTA);
        assertEquals(Multiply.multiply(1.00, 9.00), 9.00, DELTA);
        assertEquals(Multiply.multiply(2.00, 9.00), 18.00, DELTA);
        assertEquals(Multiply.multiply(99.00, 9.00), 891.00, DELTA);
        assertEquals(Multiply.multiply(-99.00, 9.00), -891.00, DELTA);
    }

    @Test
    public void isNotEqual() {
        assertNotEquals(Multiply.multiply(6.00, 9.00), 45.00, DELTA);
        assertNotEquals(Multiply.multiply(1.00, 9.00), 9.01, DELTA);
        assertNotEquals(Multiply.multiply(2.00, 9.00), 18.01, DELTA);
        assertNotEquals(Multiply.multiply(99.00, 9.00), 892.00, DELTA);
    }
}
