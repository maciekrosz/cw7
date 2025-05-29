public class Main {
    public static void main(String[] args) {
        try {
            LiquidContainer milk = new LiquidContainer(200, 300, 1000, 5000, false);
            milk.load(4000);
            System.out.println(milk);

            GasContainer helium = new GasContainer(200, 300, 800, 3000, 5);
            helium.load(2000);
            helium.unload();
            System.out.println(helium);

        } catch (OverfillException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }
}
