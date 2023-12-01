package src;

public class SentenceVerification {

    private static String input;

    /**
     * This checks if the string input:
     * * Has a capital letter at the beginning
     * * Has an even number of quotation marks
     * * Ends with a proper termination character (e.g. ".", "?")
     * * Has no period character other than the last character
     * * Has numbers below 13 spelled out
     *
     * @param input the string to be checked for if it is "valid"
     * @return false if string is valid, true if not
     */
    public static boolean isSentenceValid(String input) {
        SentenceVerification.input = input;

        if (!capitalLetterIsAtBeginning()) return false; // checks if string starts with a capital letter
        if (!stringTerminated()) return false; // checks if string is terminated properly
        if (!numbersBelow13SpelledOut()) return false; // checks that numbers below 13 are spelled out.


        int quotationNumber = 0; // number of quotation marks in sentence
        int terminationCharacterCount = 0; // counts number of times a termination character has occurred in string

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '"') quotationNumber++;
            if (input.charAt(i) == '!' || input.charAt(i) == '.' || input.charAt(i) == '?') terminationCharacterCount++;
        }

        if (quotationNumber % 2 == 1) return false; // uneven number of quotation marks in the entire string
        if (terminationCharacterCount > 1) return false; // only allow one (at the end) termination character in string
        return true;
    }

    /**
     * Checks if the character at the beginning is a capital letter
     *
     * @return true if it is a capital letter, false otherwise
     */
    private static boolean capitalLetterIsAtBeginning() {
        return isUpperCase(SentenceVerification.input.charAt(0));
    }

    /**
     * Checks if a character is upper case
     *
     * @param first the character to be checked (the first character in the string)
     * @return true if within the range of upper case letters, false otherwise
     */
    private static boolean isUpperCase(char first) {
        return first >= 65 && first <= 90;
    }

    /**
     * Checks if the last character is a proper termination character such as ".", "?", "!"
     *
     * @return true if it is a proper termination character, false otherwise.
     */
    private static boolean stringTerminated() {
        char last = input.charAt(input.length() - 1); // final character in input string
        if (last == '!' || last == '.' || last == '?') return true;
        return false;
    }

    /**
     * Checks that only numbers above 13 are digits in the input string
     * @return true if no digit numbers below 13, false otherwise
     */
    private static boolean numbersBelow13SpelledOut() {
        String[] numbers = input.split("\\d+"); // "\d+" regex will find digits of any length and place
        // them inside the numbers string array.

        for (String number : numbers) {
            if (Integer.parseInt(number) < 13)
                return false; // if number is below 13, (and so isn't spelled out) return false
        }
        return true;
    }

}
