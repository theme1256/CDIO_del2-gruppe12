import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void username() {
        Player p = new Player(1000, "Player 1");
        assertEquals("Player 1", p.username);
    }

    @Test
    void score() {
        Player p = new Player(1000, "");
        assertEquals(1000, p.get_balance());
    }
}