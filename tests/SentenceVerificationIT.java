package tests;

import org.junit.Test;
import src.SentenceVerification;

import static org.junit.Assert.*;

public class SentenceVerificationIT {
    static String input;

    /**
     * Checks if the first letter being lower case returns false from isSentenceValid
     */
    @Test
    public void startIsLowerCase() {
        input = "this is an invalid sentence.";
        assertFalse(SentenceVerification.isSentenceValid(input));
    }

    /**
     * checks if the first letter being upper case returns true from isSentenceValid
     */
    @Test
    public void startIsUpperCase() {
        input = "This is a valid sentence.";
        assertTrue(SentenceVerification.isSentenceValid(input));
    }

    /**
     * checks if the first character not being a letter returns false from isSentenceValid
     */
    @Test
    public void startIsNotLetter() {
        input = "0 is not a sentence starter";
        assertFalse(SentenceVerification.isSentenceValid(input));

    }
}
