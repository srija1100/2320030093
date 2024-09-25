package srija.com;
import java.util.Scanner;
import java.util.Set;

public class LanguageTranslator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        TranslationDictionary dictionary = new TranslationDictionary();
        String choice;

        do {
            System.out.println("1. Add Translation");
            System.out.println("2. Get Translations");
            System.out.println("3. List All Translations");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter word: ");
                    String word = scanner.nextLine();
                    System.out.print("Enter translation: ");
                    String translation = scanner.nextLine();
                    dictionary.addTranslation(word, translation);
                    System.out.println("Translation added!");
                    break;

                case "2":
                    System.out.print("Enter word to translate: ");
                    String wordToTranslate = scanner.nextLine();
                    Set<String> translations = dictionary.getTranslations(wordToTranslate);
                    if (translations.isEmpty()) {
                        System.out.println("No translations found.");
                    } else {
                        System.out.println("Translations for '" + wordToTranslate + "': " + translations);
                    }
                    break;

                case "3":
                    dictionary.displayAllTranslations();
                    break;

                case "4":
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (!choice.equals("4"));

        scanner.close();
	}

}
