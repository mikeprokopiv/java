package warmup;

import org.junit.Test;

import static org.junit.Assert.*;

public class EqualIsNotTest {
   private EqualIsNot ein = new EqualIsNot();

    @Test
    public void notNullAssertion (){
        boolean result = ein.equalIsNot(null);
        assertFalse("User entered a null string", result);
    }

    @Test
    public void longStringTrueAssertion (){
        boolean result = ein.equalIsNot("noisxxnotyynotxisi");
        assertTrue(result);
    }

    @Test
    public void longStringFalseAssertion (){
        boolean result = ein.equalIsNot("noisxxnotyynotxsi");
        assertFalse(result);
    }

    @Test
    public void stringWithDigitFalseAssertion (){
        boolean result = ein.equalIsNot("isisnotno7Not");
        assertFalse(result);
    }
    @Test
    public void threeWordsIsAssertion (){
        boolean result = ein.equalIsNot("This is not");
        assertFalse(result);
    }
    @Test
    public void emptyStringAssertion (){
        boolean result = ein.equalIsNot("");
        assertTrue(result);
    }
    @Test
    public void threeWordsTrueAssertion (){
        boolean result = ein.equalIsNot("This is notnot");
        assertTrue(result);
    }
}
