package exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversedSequenceTest {

    @Test
    void toStringTest() {
        ReversedSequence text = new ReversedSequence("a п c 1 def");
        String expected = "fed 1 c п a";
        String actual = text.toString();
        assertEquals(expected, actual);
    }

    @Test
    void lengthTest() {
        String str = "abcdef";
        String blank = "";
        ReversedSequence text = new ReversedSequence(str);
        ReversedSequence text1 = new ReversedSequence(blank);
        int expected1 = str.length();
        int actual1 = text.length();
        assertEquals(expected1, actual1);

        int expected2 = 0;
        int actual2 = text1.length();
        assertEquals(expected2, actual2);


    }

    @Test
    void subSequenceTest() {
        ReversedSequence text = new ReversedSequence("abcdef");
        String expected = "edc";
        CharSequence actual = text.subSequence(1, 4);
        assertEquals(expected, actual.toString());
    }

    @Test
    void charAtTest() {
        ReversedSequence text = new ReversedSequence("abcdef");
        char expected = 'e';
        char actual = text.charAt(1);
        assertEquals(expected, actual);
    }
}