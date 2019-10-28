import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    void roll_limit() {
        Dice dice = new Dice();
        int face = 0;
        for (int i = 0; i < 10000; i++) {
            assertFalse(dice.roll() > 6, "Der blev slået en værdi over 6");
        }
    }

    @Test
    void roll() {
        int normalmargin = 400;
        int loops = 6000;
        Dice dice = new Dice();
        int[] faces = new int[6];
        for (int i = 0; i < loops; i++) {
            faces[dice.roll()-1]++;
        }
        for (int face : faces) {
            assertNotEquals(0, face, "Der var en side der slet ikke blev slået");
            assertTrue((face <= loops/6+normalmargin), "Et tal blev slået meget mere");
            assertTrue((loops/6-normalmargin <= face), "Et tal blev slået meget mindre");
        }
    }
}