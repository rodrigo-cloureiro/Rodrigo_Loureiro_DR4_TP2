package parrot;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ParrotTest {
    @Test
    void getSpeedOfEuropeanParrot() {
        Parrot parrot = new Parrot(new EuropeanParrotBehavior());
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    void getSpeedOfAfricanParrotWithOneCoconut() {
        Parrot parrot = new Parrot(new AfricanParrot(1));
        assertEquals(3.0, parrot.getSpeed(), 0.0);
    }

    @Test
    void getSpeedOfAfricanParrotWithTwoCoconuts() {
        Parrot parrot = new Parrot(new AfricanParrot(2));
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    void getSpeedOfAfricanParrotWithNoCoconuts() {
        Parrot parrot = new Parrot(new AfricanParrot(0));
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    //
//    @Test
//    void getSpeedNorwegianBlueParrot_nailed() {
//        Parrot parrot = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 1.5, true);
//        assertEquals(0.0, parrot.getSpeed(), 0.0);
//    }
//
//    @Test
//    void getSpeedNorwegianBlueParrot_not_nailed() {
//        Parrot parrot = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 1.5, false);
//        assertEquals(18.0, parrot.getSpeed(), 0.0);
//    }
//
//    @Test
//    void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
//        Parrot parrot = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 4, false);
//        assertEquals(24.0, parrot.getSpeed(), 0.0);
//    }
//
//    @Test
//    void getCryOfEuropeanParrot() {
//        Parrot parrot = new Parrot(ParrotTypeEnum.EUROPEAN, 0, 0, false);
//        assertEquals("Sqoork!", parrot.getCry());
//    }
//
    @Test
    void getCryOfAfricanParrot() {
        Parrot parrot = new Parrot(new AfricanParrot(1));
        assertEquals("Sqaark!", parrot.getCry());
    }
//
//    @Test
//    void getCryOfNorwegianBlueHighVoltage() {
//        Parrot parrot = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 4, false);
//        assertEquals("Bzzzzzz", parrot.getCry());
//    }
//
//    @Test
//    void getCryOfNorwegianBlueNoVoltage() {
//        Parrot parrot = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 0, false);
//        assertEquals("...", parrot.getCry());
//    }
}
