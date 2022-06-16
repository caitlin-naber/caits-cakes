import java.math.BigDecimal;
import java.util.Objects;

public class Cake implements Orderable {


    private String name;
    private String cakeType;
    private String frostingType;
    private String filling;
    private String decorations;



    public Cake(String name, String cakeType, String frostingType, String filling, String decorations) {
        this.name = name;
        this.cakeType = cakeType;
        this.frostingType = frostingType;
        this.filling = filling;
        this.decorations = decorations;
    }

    public Cake() {

    }


    public String getName() {
        return name;
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

    public void setDecorations(String decorations) {
        this.decorations = decorations;
    }

    public void setFilling(String filling) {
        this.filling = filling;

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cake cake = (Cake) o;
        return Objects.equals(name, cake.name) && Objects.equals(cakeType, cake.cakeType) && Objects.equals(frostingType, cake.frostingType) && Objects.equals(filling, cake.filling) && Objects.equals(decorations, cake.decorations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cakeType, frostingType, filling, decorations);

    public void setFilling(String filling) {
        this.filling = filling;
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
