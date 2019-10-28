import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void add_to_balance() {
        int start_balance = 1000;
        int add = 500;
        Account a = new Account(start_balance);
        assertEquals((start_balance + add), a.add_to_balance(add));
    }
    @Test
    void add_to_balance_negative() {
        int start_balance = 1000;
        int add = -500;
        Account a = new Account(start_balance);
        assertEquals((start_balance + add), a.add_to_balance(add));
    }

    @Test
    void set_balance() {
        int start_balance = 1000;
        int set_to = 500;
        Account a = new Account(start_balance);
        a.set_balance(set_to);
        assertEquals(set_to, a.get_balance());
    }

    @Test
    void get_balance() {
        int start_balance = 1000;
        Account a = new Account(start_balance);
        assertEquals(start_balance, a.get_balance());
    }
}