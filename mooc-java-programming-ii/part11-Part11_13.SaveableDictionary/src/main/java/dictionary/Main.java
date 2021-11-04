package dictionary;

public class Main {

    public static void main(String[] args) {
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        boolean wasSuccessful = dictionary.load();

        if (wasSuccessful) {
            System.out.println("Successfully loaded the dictionary from file");
        }

        System.out.println(dictionary.translate("apple"));
        System.out.println(dictionary.translate("pear"));
        System.out.println(dictionary.translate("banana"));
        dictionary.add("word", "slovo");
        
        
        wasSuccessful = dictionary.save();
        if (wasSuccessful) {
            System.out.println("Successfully saved the translations to dictionary");
        }
   }
}
