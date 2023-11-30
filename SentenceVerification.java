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

        return false;
    }

    private static boolean capitalLetterIsAtBeginning() {

        return false;
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
