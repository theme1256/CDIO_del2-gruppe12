import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    void roll_limit() {
        Dice dice = new Dice();
        int face7 = 0;
        for (int i = 0; i < 1000; i++) {
            if (dice.roll() == 7) {
                face7++;
            }
        }
        assertEquals(0, face7);
    }

    @Test
    void roll() {
        Dice dice = new Dice();
        int face1 = 0, face2 = 0, face3 = 0, face4 = 0, face5 = 0, face6 = 0;
        for (int i = 0; i < 1000; i++) {
            switch (dice.roll()) {
                case 1: face1++; break;
                case 2: face2++; break;
                case 3: face3++; break;
                case 4: face4++; break;
                case 5: face5++; break;
                case 6: face6++; break;
                default:
                    break;
            }
        }
        assertTrue((face1 > 0 && face2 > 0 && face3 > 0 && face4 > 0 && face5 > 0 && face6 > 0), "Der blev slået noget af alle sider");
    }
}