public class Spice extends Ingredient {
    private int spicinessLevel;
    private String flavorProfile;

    Spice(String name, String category, boolean isVegetarian, boolean isGlutenFree, boolean isDairyFree,
            int spicinessLevel, String flavorProfile) {
        super(name, category, isVegetarian, isGlutenFree, isDairyFree);
        this.spicinessLevel = spicinessLevel;
        this.flavorProfile = flavorProfile;
    }

    public void setSpicinessLevel(int spicinessLevel) {
        this.spicinessLevel = spicinessLevel;
    }
    
    public void setFlavorProfile(String flavorProfile) {
        this.flavorProfile = flavorProfile;
    }

    public int getSpicinessLevel() {
        return this.spicinessLevel;
    }

    public String getFlavorProfile() {
        return this.flavorProfile;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        String text = 
        "Spiciness Level: "+this.spicinessLevel+
        "\nFlavor Profile: "+this.flavorProfile+"\n";
        return text;
    }
}
