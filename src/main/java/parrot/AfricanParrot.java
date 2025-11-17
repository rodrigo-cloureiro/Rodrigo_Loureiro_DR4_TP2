package parrot;

public class AfricanParrot implements ParrotBehavior {
    private static final String CRY_SOUND = "Sqaark!";
    private static final double LOAD_FACTOR = 9.0;
    private static final double MIN_SPEED = 0.0;
    private final int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        return Math.max(MIN_SPEED, BASE_SPEED - LOAD_FACTOR * numberOfCoconuts);
    }

    @Override
    public String getCry() {
        return CRY_SOUND;
    }
}
