package warmup;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class GHappyTest {
    private GHappy gha = new GHappy();

    @Test
    public void notNullString() {
        boolean result = gha.gHappy(null);
        assertFalse(result);
    }


    @Test
    public void emptyString() {
        boolean result = gha.gHappy("");
        assertTrue(result);
    }

    @Test
    public void stringWith2GInaRow() {
        boolean result = gha.gHappy("gg");
        assertTrue(result);
    }

    @Test
    public void stringWith3G() {
        boolean result = gha.gHappy("xxgggxyg");
        assertFalse(result);
    }


    @Test
    public void stringWith4PairedGLetters() {
        boolean result = gha.gHappy("xxgggxygg");
        assertTrue(result);
    }

}
