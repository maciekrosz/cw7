public abstract class Container {
    private static int counter = 1;
    protected String serialNumber;
    protected double height;
    protected double depth;
    protected double ownWeight;
    protected double maxLoad;
    protected double currentLoad = 0;

    public Container(String type, double height, double depth, double ownWeight, double maxLoad) {
        this.serialNumber = "KON-" + type + "-" + counter++;
        this.height = height;
        this.depth = depth;
        this.ownWeight = ownWeight;
        this.maxLoad = maxLoad;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void load(double mass) throws OverfillException {
        if (currentLoad + mass > maxLoad) {
            throw new OverfillException("Przepełnienie kontenera " + serialNumber);
        }
        currentLoad += mass;
    }

    public void unload() {
        currentLoad = 0;
    }

    public String toString() {
        return serialNumber + " [" + currentLoad + "/" + maxLoad + " kg]";
    }
}
