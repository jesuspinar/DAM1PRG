package com.programacionOO.tema10.game;

import com.programacionOO.libs.Util;

public class Player {
    private String name;
    private IStrategy iStrategy;

    public Player(String name, IStrategy iStrategy) {
        this.name = name;
        this.iStrategy = iStrategy;
    }

    /**
     *
     * @return is choiced number
     */
    public int play(){
        return iStrategy.play();
    }
    public void onCheckNumber(Game.PlayResult playResult){
        iStrategy.onCheckNumber(playResult);
    }

    public String getName() {
        return name;
    }
    public void init(int min, int max) {
      iStrategy.init(min,max);
    }
}
