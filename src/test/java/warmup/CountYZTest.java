package warmup;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountYZTest {

  private CountYZ countyz = new CountYZ();

    @Test
    public void shouldAcceptSpecialCharsString() {
        int result = countyz.countYZ("!!day--yaz!!");
        assertEquals(2,result);
    }

    @Test
    public void testTwoWordsString(){
        int result = countyz.countYZ("day yak");
        assertEquals(1, result);
    }

    @Test
    public void testOneWordsString(){
        int result = countyz.countYZ("yak");
        assertEquals(0, result);
    }

    @Test
    public void testThreeWordsString(){
        int result = countyz.countYZ("aaz yyz my");
        assertEquals(3, result);
    }

    @Test
    public void shouldAcceptLettersWithDigits(){
        int result = countyz.countYZ("aaz my4");
        assertEquals(2, result);
    }

    @Test
    public void testNullString(){
        int result = countyz.countYZ(null);
        assertEquals(0, result);
    }

}