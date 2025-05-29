public class RefrigeratedContainer extends Container {
    private String productType;
    private double temperature;

    public RefrigeratedContainer(double height, double depth, double ownWeight, double maxLoad,
                                 String productType, double temperature) {
        super("C", height, depth, ownWeight, maxLoad);
        this.productType = productType;
        this.temperature = temperature;
    }

    public boolean canStore(String product, double requiredTemp) {
        return product.equals(productType) && temperature <= requiredTemp;
    }
}
