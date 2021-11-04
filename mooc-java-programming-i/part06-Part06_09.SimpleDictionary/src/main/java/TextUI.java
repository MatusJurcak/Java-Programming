
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            if(command.equals("add")){
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);
                continue;
            }
            if(command.equals("search")){
                System.out.println("To be translated:");
                String word = scanner.nextLine();
                if(this.dictionary.translate(word) == null){
                    System.out.println("Word " + word + " was not found");
                }
                else{
                    System.out.println("Translation: " + this.dictionary.translate(word));
                }
                continue;
            }
            System.out.println("Unknown command");
        }
    }
}
