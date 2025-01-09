import java.util.ArrayList;
import java.util.List;

public class RecipeBook implements Filterable {
    private List<Recipe> recipes;

    RecipeBook() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public void removeRecipe(String recipe) {
        this.recipes.remove(recipe);
    }

    public List<Recipe> getAllRecipes() {
        return this.recipes;
    }

    @Override
    public List<Recipe> filterByCriteria(String criteria) {
        List<Recipe> filteredRecipes = new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (recipe.getName().toLowerCase().contains(criteria.toLowerCase()) ||
                    recipe.getCuisineType().toLowerCase().contains(criteria.toLowerCase())) {
                filteredRecipes.add(recipe);
            }
        }
        return filteredRecipes;
    }
}
