package srija.com;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class TranslationDictionary {
	private Map<String, Set<String>> dictionary;

    public TranslationDictionary() {
        dictionary = new HashMap<>();
    }

    public void addTranslation(String word, String translation) {
        dictionary.computeIfAbsent(word, k -> new HashSet<>()).add(translation);
    }

    public Set<String> getTranslations(String word) {
        return dictionary.getOrDefault(word, new HashSet<>());
    }

    public Set<String> getAllWords() {
        return dictionary.keySet();
    }

    public void displayAllTranslations() {
        for (String word : dictionary.keySet()) {
            System.out.println(word + " -> " + dictionary.get(word));
        }
    }
}
