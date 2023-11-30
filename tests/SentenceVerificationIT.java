package tests;

import org.junit.Test;
import src.SentenceVerification;

import static org.junit.Assert.*;

public class SentenceVerificationIT {
    static String input;


    @Test
    public void startIsLowerCase() {
        input = "this is an invalid sentence";
        assertFalse(SentenceVerification.isSentenceValid(input));
    }

    @Test
    public void startIsUpperCase() {

    }

    @Test
    public void startIsNotLetter() {

    }
}
