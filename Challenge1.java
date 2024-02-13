import java.util.Character;

public class Challenge1 {
    static final java.util.Scanner input = new java.util.Scanner(System.in);

    public static boolean isSentence(char c) {// method for checking is a sentence has been reached by checking if char
                                              // is a point '.'
        return c == '.' || c == '?' || c == '!';
    }

    public static void main(String[] args) {

        // Get text from user
        String text;
        do {
            System.out.print("Text: ");
            text = input.nextLine();
        } while ((text.charAt(text.length() - 1) == '!' || text.charAt(text.length() - 1) == '.'
                || text.charAt(text.length() - 1) == '?') == false);

        int len = text.length();

        double numletters = 0, numwords = 1, numsentences = 0;

        // iterating through the text to get number of letter, words and sentences
        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            if (isSentence(c))
                numsentences++;
            if (Character.isLetter(c))
                numletters++;
            if (c == ' ')
                numwords++;
        }

        // Do all the calculations
        // -Get L
        double l = (numletters / numwords) * 100;
        // -Get S
        double s = (numsentences / numwords) * 100;
        int index = (int) ((.0588 * l) - (.296 * s) - 15.8);

        // Printing Grade
        System.out.println("Grade: " + index);

        Scanner.close();
    }
}