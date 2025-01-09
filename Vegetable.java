public class Vegetable extends Ingredient {
    private boolean isOrganic;

    Vegetable(String name, String category, boolean isVegetarian, boolean isGlutenFree, boolean isDairyFree, boolean isOrganic) {
        super(name, category, isVegetarian, isGlutenFree, isDairyFree);
        this.isOrganic = isOrganic;
        super.setVegetarian(true);
        super.setGlutenFree(true);
        super.setDairyFree(true);
    }

    public void setOrganic(boolean isOrganic) {
        this.isOrganic = isOrganic;
    }

    public boolean isOrganic() {
        return this.isOrganic;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        String text = 
        "Organic: "+this.isOrganic+"\n";
        return text;
    }
}
