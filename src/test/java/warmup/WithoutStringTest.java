package warmup;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class WithoutStringTest {

    private WithoutString ws = new WithoutString();

    @Test
    public void InputOftwoWordsCheck() {
        String result = ws.withoutString("Hello there", "llo");
        assertEquals("He there", result);
    }

    @Test
    public void InputStringWithCapitalLettersCheck() {
        String result = ws.withoutString("This is a FISH", "IS");
        assertEquals("Th  a FH", result);
    }

    @Test
    public void InputStringWithDigitCheck() {
        String result = ws.withoutString("AA22bb", "2");
        assertEquals("AAbb", result);
    }

    @Test
    public void InputStringWithDigitsOnlyCheck() {
        String result = ws.withoutString("1111", "11");
        assertEquals("", result);
    }

    @Test //we expect spec char will not be handled within current implementation
    public void InputStringWithSpecCharCheck() {
        String result = ws.withoutString("A#$%b", "#$%");
        assertEquals("A#$%b", result);
    }

    @Test (expected = NullPointerException.class)
    public void nullBaseCheck() {
        String result = ws.withoutString(null, "Test");
        assertNull(result);
    }

    @Test (expected = NullPointerException.class)
    public void nullRemoveCheck() {
        String result = ws.withoutString("Test", null);
        assertNull(result);
    }

}