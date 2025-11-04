package parrot;

public class Parrot {
    private final ParrotBehavior parrot;

    public Parrot(ParrotBehavior parrot) {
        this.parrot = parrot;
    }

    public double getSpeed() {
        return parrot.getSpeed();
    }

    public String getCry() {
        return parrot.getCry();
    }
}
