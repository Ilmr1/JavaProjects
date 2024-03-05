
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {
    @Test
    public void testIsPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("racecar"));
        assertTrue(checker.isPalindrome("Able , was I, I saw Elba"));
        assertFalse(checker.isPalindrome("java"));
        assertFalse(checker.isPalindrome("openai"));
        assertFalse(checker.isPalindrome("github"));
    }
}