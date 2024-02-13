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
            if (isSentence(text.charAt(i)))
                numsentences++;
            if (Character.isLetter(text.charAt(i)))
                numletters++;
            if (text.charAt(i) == ' ')
                numwords++;
        }

        // Do all the calculations
        // -Get L
        double l = Double.parseDouble(String.format("%.2f", (numletters / numwords) * 100));
        // -Get S
        double s = Double.parseDouble(String.format("%.2f", (numsentences / numwords) * 100));
        int index = (int) ((.0588 * l) - (.296 * s) - 15.8);

        // Printing Grade
        System.out.println("Grade: " + index);

    }
}
// My Note
// Challenge
// Note: " Sentences are typically delimited by punctuation marks such as
// periods (.), question marks (?), or exclamation points (!). These marks
// indicate the beginning and end of a sentence and help clarify its structure
// and meaning".- Chatgpt

// Get
// number of letter
// number of words
// number of sentences

// Formula: Index = 0.0588 * L – 0.296 * S – 15.8

// Consider the above-mentioned example. The text the user inputted has 65
// letters, 4 sentences,
// and 14 words.

// L= average number of letters per 100 words in the text,(Ex: 65 / 14 * 100 =
// 464.29)
// S= average numberof sentences per 100 words in the text.(Ex: 4 / 14 * 100 =
// 28.57)