public class SentenceVerification {

    private static String input;

    public static boolean isSentenceValid(String input) {
        SentenceVerification.input = input;
        if(!capitalLetterIsAtBeginning()) return false;

        return false;
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
