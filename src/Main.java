public class Main {
    private static int numberOfPlayers = 2;
    private static int numberOfDices = 2;
    private static int numberOfDiceSides = 6;
    private static int winningScore = 3000;
    private static int startingScore = 1000;

    public static void main(String[] args) {
        Player[] players = new Player[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++) {
            players[i] = new Player(startingScore);
        }

        Shaker shaker = new Shaker(numberOfDices, numberOfDiceSides);

        Player winner = players[0];

        while(true) {
            boolean winner_found = false;
            for (int i = 0; i < numberOfPlayers; i++) {
                boolean extra_turn = false;
                System.out.println("Now it's " + players[i].username + "'s turn");

                int roll = shaker.shake_and_sum();
                System.out.println("You rolled " + roll);
                int score = 0;
                switch (roll) {
                    case 2:
                        score = 250;
                        break;
                    case 3:
                        score = -100;
                        break;
                    case 4:
                        score = 100;
                        break;
                    case 5:
                        score = -20;
                        break;
                    case 6:
                        score = 180;
                        break;
                    case 7:
                        score = 0;
                        break;
                    case 8:
                        score = -70;
                        break;
                    case 9:
                        score = 60;
                        break;
                    case 10:
                        System.out.println("Your get an extra turn!");
                        extra_turn = true;
                        score = -80;
                        break;
                    case 11:
                        score = -50;
                        break;
                    case 12:
                        System.out.println("Your found gold in the mountains, you are rich!!");
                        score = 650;
                        break;
                }
                System.out.println("Add " + score + " to your balance");

                int player_score = players[i].add_to_balance(score);
                System.out.println("Your score is now " + player_score);
                if(player_score >= winningScore) {
                    winner_found = true;
                    winner = players[i];
                    break;
                }
                if(extra_turn)
                    i--;
            }
            if(winner_found)
                break;
        }

        System.out.println("");
        System.out.println("The winner is " + winner.username);
    }
}
