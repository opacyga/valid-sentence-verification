package src;

public class SentenceVerification {

    private static String input;

    /**
     * This checks if the string input:
     *  * Has a capital letter at the beginning
     *  * Has an even number of quotation marks
     *  * Ends with a proper termination character (e.g. ".", "?")
     *  * Has no period character other than the last character
     *  * Has numbers below 13 spelled out
     *
     * @param input the string to be checked for if it is "valid"
     * @return false if string is valid, true if not
     */
    public static boolean isSentenceValid(String input) {
        SentenceVerification.input = input;
        if(!capitalLetterIsAtBeginning()) return false;
        for (int i = 0; i < input.length(); i++) {

        }

        return true;
    }

    /**
     * Checks if the character at the beginning is a capital letter
     * @return true if it is a capital letter, false otherwise
     */
    private static boolean capitalLetterIsAtBeginning() {
        return isUpperCase(SentenceVerification.input.charAt(0));
    }

    /**
     * Checks if a character is upper case
     * @param first the character to be checked (the first character in the string)
     * @return true if within the range of upper case letters, false otherwise
     */
    private static boolean isUpperCase(char first) {
        return first >= 65 && first <= 90;
    }

    private static boolean evenNumberQuotationMarks() {

        return false;
    }

    private static boolean stringTerminated() {

        return false;
    }

    private static boolean periodCharOnlyAtEnd() {

        return false;
    }

    private static boolean numbersBelow13SpelledOut() {

        return false;
    }
}
