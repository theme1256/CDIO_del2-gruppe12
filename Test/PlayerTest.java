import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void create_player() {
        Player p = new Player(1000, "Player 1");
        assertEquals("Player 1", p.username);
        assertEquals(1000, p.get_balance());
    }

    @Test
    void score() {
        Player p = new Player(1000, "");
        assertEquals(1000, p.get_balance());
    }

    @Test
    void reset_score() {
        Player p = new Player("");
        p.reset_balance(20000);
        assertEquals(20000, p.get_balance());
    }
}