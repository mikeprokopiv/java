package warmup;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NevadaTest {
    private Nevada Nev = new Nevada();

    @Test
    public void Splosion() {
        String result = Nev.stringSplosion("Code");
        assertEquals("CCoCodCode", result);

    }
}
