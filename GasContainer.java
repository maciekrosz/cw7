public class GasContainer extends Container implements IHazardNotifier {
    private double pressure;

    public GasContainer(double height, double depth, double ownWeight, double maxLoad, double pressure) {
        super("G", height, depth, ownWeight, maxLoad);
        this.pressure = pressure;
    }

    @Override
    public void unload() {
        currentLoad *= 0.05; // 5% zostaje
    }

    @Override
    public void notifyHazard(String message) {
        System.out.println("NOTYFIKACJA: " + message);
    }
}
