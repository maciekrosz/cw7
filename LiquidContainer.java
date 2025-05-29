public class LiquidContainer extends Container implements IHazardNotifier {
    private boolean isHazardous;

    public LiquidContainer(double height, double depth, double ownWeight, double maxLoad, boolean isHazardous) {
        super("L", height, depth, ownWeight, maxLoad);
        this.isHazardous = isHazardous;
    }

    @Override
    public void load(double mass) throws OverfillException {
        double limit = isHazardous ? maxLoad * 0.5 : maxLoad * 0.9;
        if (mass > limit) {
            notifyHazard("Próba przeładowania " + serialNumber);
            throw new OverfillException("Niebezpieczne przeładowanie kontenera " + serialNumber);
        }
        currentLoad = mass;
    }

    @Override
    public void notifyHazard(String message) {
        System.out.println("NOTYFIKACJA: " + message);
    }
}
