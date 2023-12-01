package src;

import java.util.Scanner;

public class SentenceVerifier {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("""
                A sentence is valid if it has
                * A capital letter
                * An even number of quotation marks
                * Ends with a Termination character e.g. "."
                * Has no other termination character apart from the final character
                * Numbers below 13 are spelled out
                """);
        while (true) {
            System.out.print("Please enter a sentence to check if it is valid, or enter -1 to exit: ");
            String input = reader.nextLine();
            if (input.equalsIgnoreCase("-1")) return;
            System.out.println("\n The string: \"" + input + "\" is " + ((SentenceVerification.isSentenceValid(input)) ? "a valid sentence." : "an invalid sentence"));
        }

    }
}
