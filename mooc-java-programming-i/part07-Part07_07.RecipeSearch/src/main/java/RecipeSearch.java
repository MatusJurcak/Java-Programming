
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args){
        Scanner scanne = new Scanner(System.in);
        System.out.print("File to read: ");
        String file = scanne.nextLine();
        UserInterface ui = new UserInterface();
        ui.start(file);
    }
}
