import java.math.BigDecimal;

public class Cake {

    private String name;
    private String cakeType;
    private String frostingType;
    private String filling;
    private String decorations;
    private BigDecimal price;


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

    public BigDecimal getPrice() {
        return price;
    }

    public void setDecorations(String decorations) {
        this.decorations = decorations;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String cakeSummary() {
        String summary = name + ": \n" + cakeType + " with " + frostingType;
        if (getFilling() != "none" && getDecorations() != "none") {
            summary = name + ": \n" + cakeType + " with " + filling + " filling, " + frostingType + ", and " + decorations + "\n";
        } else if (getFilling() != "none" && getDecorations() == "none") {
            summary = name + ": \n" + cakeType + " with " + filling + " filling and " + frostingType + "\n";
        } else if (getFilling() == "none" && getDecorations() != "none") {
            summary = name + ": \n" + cakeType + " with " + frostingType + " and " + decorations + "\n";
        }
        return summary;
    }
}
