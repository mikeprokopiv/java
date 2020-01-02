package warmup;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class WithoutStringTest {

    private WithoutString ws = new WithoutString();

    @Test
    public void inputOftwoWordsCheck() {
        String result = ws.withoutString("Hello there", "llo");
        assertEquals("He there", result);
    }

    @Test
    public void inputStringWithCapitalLettersCheck() {
        String result = ws.withoutString("This is a FISH", "IS");
        assertEquals("Th  a FH", result);
    }

    @Test
    public void inputStringWithDigitCheck() {
        String result = ws.withoutString("AA22bb", "2");
        assertEquals("AAbb", result);
    }

    @Test
    public void inputStringWithDigitsOnlyCheck() {
        String result = ws.withoutString("1111", "11");
        assertEquals("", result);
    }

    @Test //we expect spec char will not be handled within current implementation
    public void inputStringWithSpecCharCheck() {
        String result = ws.withoutString("A#$%b", "#$%");
        assertEquals("A#$%b", result);
    }

    @Test (expected = IllegalArgumentException.class)
    public void nullBaseCheck() {
        String result = ws.withoutString(null, "Test");
        assertNull(result);
    }

    @Test (expected = IllegalArgumentException.class)
    public void nullRemoveCheck() {
        String result = ws.withoutString("Test", null);
        assertNull(result);
    }

}