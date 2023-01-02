import static org.junit.Assert.*;

public class LC1839Test {

    @org.junit.Test
    public void beautifulSubstring() {
        int actual1 = LC1839.beautifulSubstring("aeiaaioaaaaeiiiiouuuooaauuaeiu");
        int actual2 = LC1839.beautifulSubstring("aeeeiiiioooauuuaeiou");
        int actual3 = LC1839.beautifulSubstring("a");

        assertEquals(13, actual1);
        assertEquals(5, actual2);
        assertEquals(0,actual3);
    }

    @org.junit.Test
    public void vowelCheck() {

        boolean actual1 = LC1839.vowelCheck("aeiou");
        boolean actual2 = LC1839.vowelCheck("aaaeeeeiiiiiooooo");

        assertTrue(actual1);
        assertFalse(actual2);
    }
}