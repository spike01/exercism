import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public Map<String,Integer> phrase(String phrase) {
        Map<String, Integer> wordCount = new HashMap();
        for(String word: phrase.split("\\W+")) {
            wordCount.put(word.toLowerCase(),
                          wordCount.getOrDefault(word.toLowerCase(), 0) + 1);
        }
        return wordCount;
    }
}
