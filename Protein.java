public class Protein extends Ingredient {
    private String source; 
    private int proteinContent; 
    private boolean isProcessed; 

    Protein(String name, String category, boolean isVegetarian, boolean isGlutenFree, boolean isDairyFree, String source, int proteinContent, boolean isProcessed) {
        super(name, category, isVegetarian, isGlutenFree, isDairyFree);
        this.source = source;
        this.proteinContent = proteinContent;
        this.isProcessed = isProcessed;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setProteinContent(int proteinContent) {
        this.proteinContent = proteinContent;
    }

    public void setProcessed(boolean isProcessed) {
        this.isProcessed = isProcessed;
    }

    public String getSource() {
        return this.source;
    }

    public int getProteinContent() {
        return this.proteinContent;
    }

    public boolean isProcessed() {
        return this.isProcessed;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        String text = 
        "Source: "+this.source+
        "\nProtein Content (gr): "+this.proteinContent+
        "\nProcessed: "+this.isProcessed+"\n";
        return text;
    }
}
