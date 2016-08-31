package Bob;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bob {
    public String hey(String phrase) {
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(phrase);
        if (phrase.trim().isEmpty()) {
            return "Fine. Be that way!";
        }
        if (phrase.toUpperCase().equals(phrase) && matcher.find()) {
            return "Whoa, chill out!";
        }
        if (phrase.endsWith("?")) {
            return "Sure.";
        }
        return "Whatever.";
    }
}
