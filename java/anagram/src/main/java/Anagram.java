import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.sort;

public class Anagram {
    private final String word;

    public Anagram(String word) {
        this.word = word;
    }

    public List<String> match(List<String> candidates) {
        ArrayList<String> matches = new ArrayList();
        for (String candidate: candidates) {
            char[] candidateLetters = candidate.toLowerCase().toCharArray();
            char[] letters = word.toLowerCase().toCharArray();
            sort(candidateLetters);
            sort(letters);

            if ((new String(candidateLetters)).equals(new String(letters)) && !(candidate.toLowerCase().equals(word.toLowerCase()))) {
                    matches.add(candidate);
                }
        }
        return matches;
    }
}
