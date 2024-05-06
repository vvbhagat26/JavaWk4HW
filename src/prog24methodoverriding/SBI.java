package prog24methodoverriding;

public class SBI extends Bank{
    @Override
    public int getRateOfInterest() {
        return 8;
    }
}
