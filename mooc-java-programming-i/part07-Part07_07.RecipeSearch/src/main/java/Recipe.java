
import java.util.ArrayList;

public class Recipe {

    private String name;
    private int minutes;
    private ArrayList<String> ingredients;

    public Recipe(String name, int minutes, ArrayList<String> ingredients) {
        this.name = name;
        this.minutes = minutes;
        this.ingredients = ingredients;
    }

    public String toString() {
        return this.name + ", cooking time: " + this.minutes;
    }

    public String getName() {
        return this.name;
    }

    public int getTime() {
        return this.minutes;
    }

    public boolean containIngredient(String ingredient) {
        for (String ing : ingredients) {
            if (ing.equals(ingredient)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

    public int sizeOfIngredients() {
        return this.ingredients.size();
    }
}
