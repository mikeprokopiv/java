package warmup;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class NevadaTest {
    private Nevada nev = new Nevada();

    @Test
    public void testNullString() {
        String result = nev.stringSplosion(null);
        assertNull(result);
    }

    @Test
    public void testStringApend() {
        String result = nev.stringSplosion("Code");
        assertEquals("CCoCodCode", result);
    }
}