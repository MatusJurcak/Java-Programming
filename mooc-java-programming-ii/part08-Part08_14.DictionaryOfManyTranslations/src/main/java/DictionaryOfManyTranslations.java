
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;
    
    public DictionaryOfManyTranslations(){
        this.dictionary = new HashMap<>();
    }
    
    public void add(String word, String translation){
        this.dictionary.putIfAbsent(word, new ArrayList<>());

        // let's first retrieve the list containing the exercises completed by the user and add to it
        this.dictionary.get(word).add(translation);

    }
    
    public ArrayList<String> translate(String word){
        if(this.dictionary.containsKey(word)){
            return this.dictionary.get(word);
        }
        return new ArrayList<String>();
    }
    
    public void remove(String word){
        this.dictionary.remove(word);
    }
}
