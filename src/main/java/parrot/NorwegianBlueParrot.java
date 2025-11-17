package parrot;

public class NorwegianBlueParrot implements ParrotBehavior {
    private static final String CRY_SOUND = "Bzzzzzz";
    private static final String NO_CRY_SOUND = "...";
    private static final double MAX_SPEED = 24.0;
    private static final double MIN_VOLTAGE_FOR_CRY = 0.0;
    private static final double DEFAULT_SPEED = 0.0;
    private final double voltage;
    private final boolean isNailed;

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        return (isNailed) ? DEFAULT_SPEED : Math.min(MAX_SPEED, voltage * BASE_SPEED);
    }

    @Override
    public String getCry() {
        return voltage > MIN_VOLTAGE_FOR_CRY ? CRY_SOUND : NO_CRY_SOUND;
    }
}
