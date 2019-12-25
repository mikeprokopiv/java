package warmup;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WashingtonTest {
    private Washington was = new Washington();

    @Test
    public void countTwoCharMatchedWithinTwoStr() {
        int result = was.stringMatch("red", "redder");
        assertEquals(2, result);
    }

    @Test(expected = NullPointerException.class)
    public void firstOfTheStringsIsNull() {
        int result = was.stringMatch(null, "red");
        assertEquals(0, result);
    }

    @Test(expected = NullPointerException.class)
    public void secondOfTheStringsIsNull() {
        int result = was.stringMatch("red", null);
        assertEquals(0, result);
    }
}
