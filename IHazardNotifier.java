public interface IHazardNotifier {
    void notifyHazard(String message);
}

public class OverfillException extends Exception {
    public OverfillException(String message) {
        super(message);
    }
}
