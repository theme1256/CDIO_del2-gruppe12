class Account {
    private int balance;

    Account() {
        this.balance = 1000;
    }
    Account(int balance) {
        this.balance = balance;
    }

    int add_to_balance(int add) {
        this.balance += add;
        return this.balance;
    }

    void set_balance(int balance) {
        this.balance = balance;
    }

    int get_balance() {
        return this.balance;
    }
}
