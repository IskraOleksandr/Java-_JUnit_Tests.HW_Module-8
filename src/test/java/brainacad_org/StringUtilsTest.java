package brainacad_org;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    @Test
    public void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("palim milap"));
        assertTrue(StringUtils.isPalindrome("madam"));
        assertFalse(StringUtils.isPalindrome("hello world"));
        assertFalse(StringUtils.isPalindrome(null));
    }

    @Test
    public void testCountVowels() {
        assertEquals(2, StringUtils.countVowels("hello"));
        assertEquals(0, StringUtils.countVowels("rhythm"));
        assertEquals(0, StringUtils.countVowels(null));
    }

    @Test
    public void testCountConsonants() {
        assertEquals(3, StringUtils.countConsonants("hello"));
        assertEquals(6, StringUtils.countConsonants("rhythm"));
        assertEquals(0, StringUtils.countConsonants(null));
    }

    @Test
    public void testCountWordOccurrences() {
        assertEquals(1, StringUtils.countWordOccurrences("hello world", "world"));
        assertEquals(0, StringUtils.countWordOccurrences("hello world", "smth"));
        assertEquals(0, StringUtils.countWordOccurrences(null, "hello"));
        assertEquals(0, StringUtils.countWordOccurrences("hello world", null));
        assertEquals(0, StringUtils.countWordOccurrences("hello world", ""));
    }
}
