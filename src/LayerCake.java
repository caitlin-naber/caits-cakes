public class LayerCake extends Cake {

    private int layers;
    private int cakeSize;

    public LayerCake(String name, String cakeType, String frostingType) {
        super(name, cakeType, frostingType);
    }

    // we want customers to be able to select number of layers and dimensions
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

    // todo: create new cakeSummary method

}
