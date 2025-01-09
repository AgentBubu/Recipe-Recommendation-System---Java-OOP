import java.util.List;

public class DessertRecipe extends Recipe {
    private int sweetnessLevel;

    DessertRecipe(String name, List<Ingredient> ingredients, String cuisineType, List<String> preparationSteps, int sweetnessLevel) {
        super(name, ingredients, cuisineType, preparationSteps);
        this.sweetnessLevel = sweetnessLevel;
    }

    public void setSweetnessLevel(int sweetnessLevel) {
        this.sweetnessLevel = sweetnessLevel;
    }

    public int getSweetnessLevel() {
        return this.sweetnessLevel;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        String text = "Sweetness Level: "+this.sweetnessLevel;
        return text;
    }
}
