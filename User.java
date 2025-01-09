import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User extends UserPreference {
    private String name, password;
    private Map<Recipe, Integer> recipeRatings; 

    User(boolean isVegetarian, boolean isGlutenFree, boolean isDairyFree, List<String> favoriteCuisines, String name, String password) {
        super(isVegetarian, isGlutenFree, isDairyFree, favoriteCuisines);
        this.name = name;
        this.password = password;
        this.recipeRatings = new HashMap<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public void rateRecipe(Recipe recipe, int stars) {
        recipeRatings.put(recipe, stars); 
    }

    public Map<Recipe, Integer> getRecipeRatings() {
        return recipeRatings;
    }
}
