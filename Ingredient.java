public class Ingredient {
    private String name, category;
    private boolean isVegetarian, isGlutenFree, isDairyFree;

    Ingredient(String name, String category, boolean isVegetarian, boolean isGlutenFree, boolean isDairyFree) {
        this.name = name;
        this.category = category;
        this.isVegetarian = isVegetarian;
        this.isGlutenFree = isGlutenFree;
        this.isDairyFree = isDairyFree;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    public void setGlutenFree(boolean isGlutenFree) {
        this.isGlutenFree = isGlutenFree;
    }

    public void setDairyFree(boolean isDairyFree) {
        this.isDairyFree = isDairyFree;
    }

    public String getName() {
        return this.name;
    }

    public String getCategory() {
        return this.category;
    }

    public boolean isVegetarian() {
        return this.isVegetarian;
    }

    public boolean isGlutenFree() {
        return this.isGlutenFree;
    }

    public boolean isDairyFree() {
        return this.isDairyFree;
    }

    @Override
    public String toString() {
        String text = 
        "Name: "+this.name+
        "\nCategory: "+this.category+
        "\nVegetarian: "+this.isVegetarian+
        "\nGluten Free: "+this.isGlutenFree+
        "\nDairy Free: "+this.isDairyFree+
        "\n";
        return text;
    }
}
