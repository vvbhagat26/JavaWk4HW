package prog24methodoverriding;

public class ICICI extends Bank{
    @Override
    public int getRateOfInterest() {
        return 7;
    }
}
