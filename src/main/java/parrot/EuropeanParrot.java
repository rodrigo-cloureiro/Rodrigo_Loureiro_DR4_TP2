package parrot;

public class EuropeanParrot implements ParrotBehavior {
    @Override
    public double getSpeed() {
        return BASE_SPEED;
    }

    @Override
    public String getCry() {
        return "Sqoork!";
    }
}
