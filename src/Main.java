import java.util.Scanner;

public class Main {
    private static int numberOfPlayers = 2;
    private static int numberOfDices = 2;
    private static int numberOfDiceSides = 6;
    private static int winningScore = 3000;
    private static int startingScore = 1000;

    public static void main(String[] args) {
        // Initialize the players
        Player[] players = new Player[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++) {
            players[i] = new Player(startingScore);
        }

        // Initialize the Shaker and the Dices inside it
        Shaker shaker = new Shaker(numberOfDices, numberOfDiceSides);

        // While a winner is not found, play the game
        boolean winner_found = false;
        while(!winner_found) {
            // Loop the players
            for (int i = 0; i < numberOfPlayers; i++) {
                // Give the user some info and roll the dices
                System.out.println("Now it's " + players[i].username + "'s turn");
                int roll = shaker.shake_and_sum();
                System.out.println("You rolled " + roll);

                // Do a lookup on what score to give, if a text should be displayed and if an extra turn should be given
                boolean extra_turn = false;
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
                        System.out.println("You get an extra turn!");
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

                // Add the score to the players balance and give som information to the player
                System.out.println("Add " + score + " to your balance");
                int player_score = players[i].add_to_balance(score);
                System.out.println("Your score is now " + player_score);

                // See if the player won or not, break the for-loop if a winner is found and give som information
                if(player_score >= winningScore) {
                    winner_found = true;

                    System.out.println("");
                    System.out.println("The winner is " + players[i].username);
                    break;
                }

                // If a player gets an extra turn, count the loop backwards, so that it is the same player again next time
                if(extra_turn)
                    i--;
            }
        }

        // This makes the program stop so that the players have the time to see what happend
        System.out.println("");
        System.out.println("Press enter to exit program");
        Scanner stopper = new Scanner(System.in);
        stopper.nextLine();
    }
}
