public class SentenceVerification {

    private static String input;

    public static boolean isSentenceValid(String input) {
        SentenceVerification.input = input;

        return false;
    }

    /**
     * Checks if the character at the beginning is a capital letter
     * @return true if it is a capital letter, false otherwise
     */
    private static boolean capitalLetterIsAtBeginning() {
        return isCapitalLetter(SentenceVerification.input.charAt(0));
    }


    private static boolean isCapitalLetter(char first) {
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
