import java.util.List;

public class MainCouseRecipe extends Recipe {
    private int servingSize;

    MainCouseRecipe(String name, List<Ingredient> ingredients, String cuisineType, List<String> preparationSteps, int servingSize) {
        super(name, ingredients, cuisineType, preparationSteps);
        this.servingSize = servingSize;
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public int getServingSize() {
        return this.servingSize;
    }

    @Override 
    public String toString() {
        System.out.println(super.toString());
        String text = 
        "Serving Size: "+this.servingSize+"\n";
        return text;
    }
}
