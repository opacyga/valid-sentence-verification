package tests;

import org.junit.Test;
import src.SentenceVerification;

import static org.junit.Assert.*;

public class SentenceVerificationIT {
    static String input;



    //////////////////////Capital Letter Testing/////////////////////
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
        input = "0 is not a sentence starter.";
        assertFalse(SentenceVerification.isSentenceValid(input));

    }

    //////////////////////Quotation Mark Testing/////////////////////
    /**
     * checks if an even number of quotations results in true being returned from isSentenceValid
     */
    @Test
    public void evenNumberOfQuotations() {
        input = "This is a \"valid\" sentence.";
        assertTrue(SentenceVerification.isSentenceValid(input));
    }

    /**
     * checks if an odd number of quotations results in false being returned from isSentenceValid
     */
    @Test
    public void oddNumberOfQuotations() {
        input = "This is an \"invalid sentence.";
        assertFalse(SentenceVerification.isSentenceValid(input));
    }

    /**
     * checks that no quotations in the string will not affect the result
     */
    @Test
    public void noQuotations() {
        input = "This sentence has no quotations.";
        assertTrue(SentenceVerification.isSentenceValid(input));
    }

    //////////////////////Termination Character Testing/////////////////////

    /**
     * checks that a sentence ending with no termination character returns false from isValidSentence
     */
    @Test
    public void danglingSentence() {

    }

    /**
     * checks that a sentence ended with a termination character (e.g. ".") returns true from isValidSentence
     */
    @Test
    public void terminatedSentence() {

    }
}
