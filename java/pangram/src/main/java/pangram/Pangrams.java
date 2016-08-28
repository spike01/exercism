package pangram;

public class Pangrams {
    public static boolean isPangram(String sentence) {
        for(char letter: "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
            if (sentence.toLowerCase().indexOf(letter) == -1) {
                return false;
            }
        }
        return true;
    }
}
