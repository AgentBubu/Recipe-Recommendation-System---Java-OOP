import java.util.List;

public class UserPreference {
    private boolean isVegetarian, isGlutenFree, isDairyFree;
    private List<String> favoriteCuisines;
    
    UserPreference(boolean isVegetarian, boolean isGlutenFree, boolean isDairyFree, List<String> favoriteCuisines) {
        this.isVegetarian = isVegetarian;
        this.isGlutenFree = isGlutenFree;
        this.isDairyFree = isDairyFree;
        this.favoriteCuisines = favoriteCuisines;
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

    public void setFavoriteCuisines(List<String> favoriteCuisines) {
        this.favoriteCuisines = favoriteCuisines;
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

    public List<String> getFavoriteCuisines() {
        return this.favoriteCuisines;
    }
}
