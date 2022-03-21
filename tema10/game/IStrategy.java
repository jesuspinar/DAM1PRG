package com.programacionOO.tema10.game;

public interface IStrategy {
    //methods
    void init(int min , int max);
    int play();
    void onCheckNumber(Game.PlayResult playResult);
    //- 1 menor
    //0 igual
    //1 mayor

}
