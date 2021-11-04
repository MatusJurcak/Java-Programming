
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {

    private ArrayList<Recipe> recipes;

    public UserInterface() {
        this.recipes = new ArrayList<>();
    }

    public void start(String file) {
        try ( Scanner scanner = new Scanner(Paths.get(file))) {
            ArrayList<String> ingredients = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String ingredient = scanner.nextLine();
                if (ingredient.isEmpty()) {
                    String name = ingredients.get(0);
                    int minutes = Integer.valueOf(ingredients.get(1));
                    ingredients.remove(1);
                    ingredients.remove(0);
                    recipes.add(new Recipe(name, minutes, ingredients));
                    ingredients = new ArrayList<>();
                    ingredients.clear();
                    continue;
                }
                ingredients.add(ingredient);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("");
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Enter command: ");
            String command = scan.nextLine();
            if (command.equals("list")) {
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
                System.out.println("");
            } else if (command.equals("stop")) {
                break;
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String word = scan.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.getName().contains(word)) {
                        System.out.println(recipe);
                    }
                }
                System.out.println("");
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int time = Integer.valueOf(scan.nextLine());
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.getTime() <= time) {
                        System.out.println(recipe);
                    }
                }
                System.out.println("");
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scan.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe recipe : this.recipes) {
                    if (recipe.containIngredient(ingredient)) {
                        System.out.println(recipe);
                    }
                }
                System.out.println("");
            }
        }
    }
}
