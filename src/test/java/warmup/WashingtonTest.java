package warmup;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WashingtonTest {
    private Washington was = new Washington();

    @Test
    public void testCountTwoCharMatchedWithinTwoStr() {
        int result = was.stringMatch("red", "redder");
        assertEquals(2, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFirstOfTheStringsIsNull() {
        int result = was.stringMatch(null, "red");
        assertEquals(0, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void tetsSecondOfTheStringsIsNull() {
        int result = was.stringMatch("red", null);
        assertEquals(0, result);
    }
}
