public class Cake {

    private String name;
    private String cakeType;
    private String frostingType;
    private String filling;
    private String decorations;
    private double price;


    public Cake(String name, String cakeType, String frostingType) {
        this.name = name;
        this.cakeType = cakeType;
        this.frostingType = frostingType;
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

    // todo: account for filling and decoration
    public String cakeSummary() {
        return name + ": " + cakeType + " with " + frostingType + ".";
    }
}
