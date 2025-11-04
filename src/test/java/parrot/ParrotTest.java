package parrot;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ParrotTest {
    @Nested
    class EuropeanParrotTests {
        @Test
        void getSpeedOfEuropeanParrot() {
            Parrot parrot = europeanParrot();
            assertEquals(12.0, parrot.getSpeed(), 0.0);
        }

        @Test
        void getCryOfEuropeanParrot() {
            Parrot parrot = europeanParrot();
            assertEquals("Sqoork!", parrot.getCry());
        }
    }

    @Nested
    class AfricanParrotTests {
        @Test
        void getSpeedOfAfricanParrotWithOneCoconut() {
            Parrot parrot = africanParrot(1);
            assertEquals(3.0, parrot.getSpeed(), 0.0);
        }

        @Test
        void getSpeedOfAfricanParrotWithTwoCoconuts() {
            Parrot parrot = africanParrot(2);
            assertEquals(0.0, parrot.getSpeed(), 0.0);
        }

        @Test
        void getSpeedOfAfricanParrotWithNoCoconuts() {
            Parrot parrot = africanParrot(0);
            assertEquals(12.0, parrot.getSpeed(), 0.0);
        }

        @Test
        void getCryOfAfricanParrot() {
            Parrot parrot = africanParrot(1);
            assertEquals("Sqaark!", parrot.getCry());
        }
    }

    @Nested
    class NorwegianBlueParrotTests {
        @Test
        void getSpeedNorwegianBlueParrotNailed() {
            Parrot parrot = norwegianBlueParrot(1.5, true);
            assertEquals(0.0, parrot.getSpeed(), 0.0);
        }

        @Test
        void getSpeedNorwegianBlueParrotNotNailed() {
            Parrot parrot = norwegianBlueParrot(1.5, false);
            assertEquals(18.0, parrot.getSpeed(), 0.0);
        }

        @Test
        void getSpeedNorwegianBlueParrotNotNailedHighVoltage() {
            Parrot parrot = norwegianBlueParrot(4, false);
            assertEquals(24.0, parrot.getSpeed(), 0.0);
        }

        @Test
        void getCryOfNorwegianBlueHighVoltage() {
            Parrot parrot = norwegianBlueParrot(4, false);
            assertEquals("Bzzzzzz", parrot.getCry());
        }

        @Test
        void getCryOfNorwegianBlueNoVoltage() {
            Parrot parrot = norwegianBlueParrot(0, false);
            assertEquals("...", parrot.getCry());
        }
    }

    private Parrot europeanParrot() {
        return new Parrot(new EuropeanParrot());
    }

    private Parrot africanParrot(int numberOfCoconuts) {
        return new Parrot(new AfricanParrot(numberOfCoconuts));
    }

    private Parrot norwegianBlueParrot(double voltage, boolean nailed) {
        return new Parrot(new NorwegianBlueParrot(voltage, nailed));
    }
}
