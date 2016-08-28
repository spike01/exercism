package pangram;

public class Pangrams {

    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static boolean isPangram(String sentence) {
        String lowerCaseSentence = sentence.toLowerCase();
        for(char letter: ALPHABET.toCharArray()) {
            if (lowerCaseSentence.indexOf(letter) == -1) {
                return false;
            }
        }
        return true;
    }
}
