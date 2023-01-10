package LLD.SnakeLadderGame;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int diceCount;
    int min = 1;
    int max = 6;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    public int rollDice(){
        int score=0;
        int diceUsed=0;
        while(diceUsed<diceCount){
            score +=(ThreadLocalRandom.current().nextInt(min,max+1));
            diceUsed++;
        }
        return score;
    }
}
