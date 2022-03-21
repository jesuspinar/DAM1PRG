package com.programacionOO.tema10.game.strategies;

import com.programacionOO.tema10.game.Game;
import com.programacionOO.tema10.game.IStrategy;

import java.util.Random;

public class StrategyOnlyEven implements IStrategy {
    private int maxNumber;
    private int minNumber;
    private Random random;
    private int number;

    public StrategyOnlyEven() {
        this.random = new Random();
    }

    @Override
    public void init(int min, int max) {
        this.minNumber = min;
        this.maxNumber = max;
    }

    @Override
    public int play() {
        int limit = maxNumber - minNumber + 1;
        int result = random.nextInt(limit) + minNumber;

        if (limit < 0 ){
            return 0;
        }
        if (result % 2 == 0 && result >= 0){
            result += 1;
        }
        return result;
    }

    @Override
    public void onCheckNumber(Game.PlayResult playResult) {
        switch (playResult){
            case MAYOR: minNumber = this.number + 1;break;
            case MINOR: maxNumber = this.number -1; break;
            case EQUAL:break;
        }
    }
}
