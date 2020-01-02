package warmup;

import org.junit.Test;

import static org.junit.Assert.*;

public class EqualIsNotTest {
   private EqualIsNot ein = new EqualIsNot();

    @Test
    public void testNullString (){
        boolean result = ein.equalIsNot(null);
        assertFalse("User entered a null string", result);
    }

    @Test
    public void testLongStringTrueAssertion (){
        boolean result = ein.equalIsNot("noisxxnotyynotxisi");
        assertTrue(result);
    }

    @Test
    public void tesLongStringFalseAssertion (){
        boolean result = ein.equalIsNot("noisxxnotyynotxsi");
        assertFalse(result);
    }

    @Test
    public void shouldAcceptStringWithDigit (){
        boolean result = ein.equalIsNot("isisnotno7Not");
        assertFalse(result);
    }
    @Test
    public void testThreeWordsFalseAssertion (){
        boolean result = ein.equalIsNot("This is not");
        assertFalse(result);
    }
    @Test
    public void shouldAcceptEmptyString (){
        boolean result = ein.equalIsNot("");
        assertTrue(result);
    }
    @Test
    public void testThreeWordsTrueAssertion (){
        boolean result = ein.equalIsNot("This is notnot");
        assertTrue(result);
    }
}
