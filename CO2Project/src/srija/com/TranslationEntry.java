package srija.com;

public class TranslationEntry {
	private String word;
    private String translation;

    public TranslationEntry(String word, String translation) {
        this.word = word;
        this.translation = translation;
    }

    public String getWord() {
        return word;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return word + " -> " + translation;
    }
}
