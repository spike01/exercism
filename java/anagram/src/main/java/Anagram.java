import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    private final String word;

    public Anagram(String word) {
        this.word = word;
    }

    public List<String> match(List<String> candidates) {
        ArrayList<String> matches = new ArrayList();
        for (String candidate: candidates) {
            if (isAnagram(candidate) && !isLowerCaseDuplicate(candidate)) {
                    matches.add(candidate);
                }
        }
        return matches;
    }

    private boolean isAnagram(String candidate) {
        char[] candidateLetters = candidate.toLowerCase().toCharArray();
        char[] wordLetters = word.toLowerCase().toCharArray();
        Arrays.sort(candidateLetters);
        Arrays.sort(wordLetters);
        return new String(candidateLetters).equals(new String(wordLetters));
    }

    private boolean isLowerCaseDuplicate(String candidate) {
        return candidate.toLowerCase().equals(word.toLowerCase());
    }
}
