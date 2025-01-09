import java.util.List;

public class Recipe {
    private String name, cuisineType;
    private List<Ingredient> ingredients;
    private List<String> preparationSteps;

    Recipe(String name, List<Ingredient> ingredients, String cuisineType, List<String> preparationSteps) {
        this.name = name;
        this.ingredients = ingredients;
        this.cuisineType = cuisineType;
        this.preparationSteps = preparationSteps;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    public String getName() {
        return this.name;
    }

    public List<Ingredient> getIngredients() {
        return this.ingredients;
    }

    public String getCuisineType() {
        return this.cuisineType;
    }

    public List<String> getPreparationSteps() {
        return this.preparationSteps;
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public void removeIngredient(String ingredientName) {
        this.ingredients.remove(ingredientName);
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder("=== RECIPE DETAILS ===");
        text.append("\nName: ").append(this.name);
        text.append("\nCuisine Type: ").append(this.cuisineType);

        text.append("\nList of Ingredients:");
        for (Ingredient ingredient : this.ingredients) {
            text.append("\n - ").append(ingredient.getName());
        }

        text.append("\nPreparation Steps:");
        int stepNumber = 1;
        for (String step : this.preparationSteps) {
            text.append("\n ").append(stepNumber++).append(". ").append(step);
        }

        return text.toString();
    }

}
