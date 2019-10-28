import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShakerTest {

    @Test
    void shake() {
        Shaker shaker = new Shaker();
        int[] sum = shaker.shake();
        assertTrue((1 <= sum[0] && sum[0] <= 6 && 1 <= sum[1] && sum[1] <= 6));
    }

    @Test
    void shake_and_sum() {
        Shaker shaker = new Shaker();
        int sum = shaker.shake_and_sum();
        assertTrue((2 <= sum && sum <= 12));
    }
}