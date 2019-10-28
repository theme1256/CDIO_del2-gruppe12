class Shaker {
    private Dice dice;
    private int numberOfDices;
    Shaker() {
        this.numberOfDices = 2;
        this.dice = new Dice();
    }
    Shaker(int numberOfDices) {
        this.numberOfDices = numberOfDices;
        this.dice = new Dice();
    }
    Shaker(int numberOfDices, int numberOfSides) {
        this.numberOfDices = numberOfDices;
        this.dice = new Dice(numberOfSides);
    }

    int[] shake() {
        int[] rtn = new int[this.numberOfDices];
        for(int i = 0; i < this.numberOfDices; i++) {
            rtn[i] = this.dice.roll();
        }
        return rtn;
    }

    int shake_and_sum() {
        int rtn = 0;
        for(int i = 0; i < this.numberOfDices; i++) {
            rtn += this.dice.roll();
        }
        return rtn;
    }
}
