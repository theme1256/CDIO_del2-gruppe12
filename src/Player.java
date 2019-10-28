import java.util.Scanner;

class Player {
    private Account account;
    String username;

    Player() {
        this.set_username();
        this.account = new Account();
    }
    Player(int score) {
        this.set_username();
        this.account = new Account(score);
    }

    private void set_username() {
        System.out.println("What is your name?");
        Scanner in = new Scanner(System.in);
        this.username = in.nextLine();
    }

    int add_to_balance(int add) {
        return this.account.add_to_balance(add);
    }
    int get_balance() {
        return this.account.get_balance();
    }
}
