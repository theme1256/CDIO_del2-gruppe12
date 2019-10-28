import java.util.Random;

class Dice {
    private int numberOfSides;

    Dice() {
        this.numberOfSides = 6;
    }
    Dice(int s) {
        if(s > 1)
        this.numberOfSides = s;
    }

    int roll() {
        Random rand = new Random();
        return 1 + rand.nextInt((numberOfSides));
    }
}
