public class Cake {

    private String name;
    private String cakeType;
    private String frostingType;
    private String decorations;
    private double price;


    public Cake(String name, String cakeType, String frostingType, String decorations) {
        this.name = name;
        this.cakeType = cakeType;
        this.frostingType = frostingType;
        this.decorations = decorations;
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

    public double getPrice() {
        return price;
    }

    public void setCakeType(String cakeType) {
        this.cakeType = cakeType;
    }

    public void setFrostingType(String frostingType) {
        this.frostingType = frostingType;
    }

    public void setDecorations(String decorations) {
        this.decorations = decorations;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String cakeSummary() {
        return name + ": " + cakeType + " with " + frostingType + " and " + decorations + ".";
    }
}
