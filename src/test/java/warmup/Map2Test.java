package warmup;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Map2Test {
    private Map2 mp2 = new Map2();

    // word0 method test
    @Test
    public void testword0Functional() {
        String[] string1 = {"red", "blue", "white"};
        mp2.word0(string1);
        assertThat(mp2.word0(string1).get("red"), is(0));
        assertThat(mp2.word0(string1).get("blue"), is(0));
        assertThat(mp2.word0(string1).get("white"), is(0));
        assertThat(mp2.word0(string1).size(), is(3));
    }

    // word0 method test
    @Test
    public void testwordLenFunctional() {
        String[] string1 = {"red", "blue", "white"};
        mp2.wordLen(string1);
        assertThat(mp2.wordLen(string1).get("red"), is(3));
        assertThat(mp2.wordLen(string1).get("blue"), is(4));
        assertThat(mp2.wordLen(string1).get("white"), is(5));
        assertThat(mp2.wordLen(string1).size(), is(3));
    }

    // pairs method test
    @Test
    public void testpairsFunctional() {
        String[] string1 = {"red", "blue", "white"};
        mp2.pairs(string1);
        assertThat(mp2.pairs(string1).get("r"), is("d"));
        assertThat(mp2.pairs(string1).get("b"), is("e"));
        assertThat(mp2.pairs(string1).get("w"), is("e"));
        assertThat(mp2.pairs(string1).size(), is(3));
    }

    // wordCount method test
    @Test
    public void testwordCountFunctional() {
        String[] string1 = {"red", "blue", "red", "red", "blue", "white"};
        mp2.wordCount(string1);
        assertThat(mp2.wordCount(string1).get("red"), is(3));
        assertThat(mp2.wordCount(string1).get("blue"), is(2));
        assertThat(mp2.wordCount(string1).get("white"), is(1));
        assertThat(mp2.wordCount(string1).size(), is(3));
    }
}