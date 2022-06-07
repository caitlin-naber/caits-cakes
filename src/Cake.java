public class Cake {

    private String name;
    private String cakeType;
    private String frostingType;
    private String filling;
    private String decorations;
    private double price;


    public Cake(String name, String cakeType, String frostingType, String filling, String decorations) {
        this.name = name;
        this.cakeType = cakeType;
        this.frostingType = frostingType;
        this.filling = filling;
        this.decorations = decorations;
    }


    public String getName() {
        return name;
    }

    public String getCakeType() {
        return cakeType;
    }

    public String getFrostingType() {
        return frostingType;
    }

    public String getDecorations() {
        return decorations;
    }

    public String getFilling() {
        return filling;
    }

    public double getPrice() {
        return price;
    }

    public void setDecorations(String decorations) {
        this.decorations = decorations;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String cakeSummary() {
        String summary = name + ": " + cakeType + " with " + frostingType;
        if (getFilling() != "none" && getDecorations() != "none") {
            summary = name + ": " + cakeType + " with " + filling + " filling, " + frostingType + ", and " + decorations;
        } else if (getFilling() != "none" && getDecorations() == "none") {
            summary = name + ": " + cakeType + " with " + filling + " filling and " + frostingType;
        } else if (getFilling() == "none" && getDecorations() != "none") {
            summary = name + ": " + cakeType + " with " + frostingType + ", and " + decorations;
        }
        return summary;
    }
}
