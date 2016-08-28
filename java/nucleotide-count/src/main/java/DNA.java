import java.util.HashMap;
import java.util.Map;

public class DNA {
    private final Map<Character, Integer> nucleotides = new HashMap<>();

    public DNA(String nucleotideString) {
        nucleotides.put('A', 0);
        nucleotides.put('C', 0);
        nucleotides.put('G', 0);
        nucleotides.put('T', 0);
        for(char nucleotide: nucleotideString.toCharArray()) {
            nucleotides.put(nucleotide, (nucleotides.get(nucleotide) + 1));
        }
    }

    public int count(Character nucleotide) {
        try {
            return nucleotides.get(nucleotide);
        } catch (NullPointerException e){
            throw new IllegalArgumentException("Value not found in nucleotides");
        }
    }

    public Map<Character, Integer> nucleotideCounts() {
        return nucleotides;
    }
}
