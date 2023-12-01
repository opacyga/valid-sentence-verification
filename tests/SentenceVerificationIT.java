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
        input = "This sentence has no termination character";
        assertFalse(SentenceVerification.isSentenceValid(input));
    }

    /**
     * checks that a sentence ended with a ! returns true from isValidSentence
     */
    @Test
    public void terminatedExclamationSentence() {
        input = "This sentence has a termination character!";
        assertTrue(SentenceVerification.isSentenceValid(input));
    }

    /**
     * checks that a sentence ended with a . returns true from isValidSentence
     */
    @Test
    public void terminatedFullStopSentence() {
        input = "This sentence has a termination character.";
        assertTrue(SentenceVerification.isSentenceValid(input));
    }

    /**
     * checks that a sentence ended with a . returns true from isValidSentence
     */
    @Test
    public void terminatedQuestionMarkSentence() {
        input = "This sentence has a termination character?";
        assertTrue(SentenceVerification.isSentenceValid(input));
    }

    /**
     * checks that a sentence with more than one period returns false from isValidSentence
     */
    @Test
    public void moreThanFullStop() {
        input = "This. Is. Not. A. Valid. Sentence.";
        assertFalse(SentenceVerification.isSentenceValid(input));
    }

    /**
     * checks that a sentence with a mix of termination characters returns false from isValidSentence
     */
    @Test
    public void moreThanOneMixedTerminationCharacters() {
        input = "This also? Isn't! A valid sentence.";
        assertFalse(SentenceVerification.isSentenceValid(input));
    }

    //////////////////////Number Testing/////////////////////

    /**
     * checks that digits below 13 in a sentence will return false from isValidSentence
     */
    @Test
    public void digitsBelow13() {

    }

    /**
     * checks that if "13" is included in the sentence, true will be returned from isValidSentence
     */
    @Test
    public void digit13Boundary() {

    }

    /**
     * checks that digits above 13 in a sentence return true from isValidSentence
     */
    @Test
    public void digitAbove13() {

    }

}
