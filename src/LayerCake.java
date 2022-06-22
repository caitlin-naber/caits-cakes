public class LayerCake extends Cake {

    private int layers;
    private int cakeSize;

    public LayerCake(String name, String cakeType, String frostingType, String filling, String decorations, int layers, int cakeSize) {
        super(name, cakeType, frostingType, filling, decorations);
        this.layers = layers;
        this.cakeSize = cakeSize;
    }

    public int getLayers() {
        return layers;
    }

    public void setLayers(int layers) {
        this.layers = layers;
    }

    public int getCakeSize() {
        return cakeSize;
    }

    public void setCakeSize(int cakeSize) {
        this.cakeSize = cakeSize;
    }

    @Override
    public String cakeSummary() {
        String summary = cakeSize + "in " + super.getName() + " cake with " + layers + " layers.";
        return summary;
    }
}
