package parrot;

public class EuropeanParrot implements ParrotBehavior {
    private static final String CRY_SOUND = "Sqoork!";

    @Override
    public double getSpeed() {
        return BASE_SPEED;
    }

    @Override
    public String getCry() {
        return CRY_SOUND;
    }
}
