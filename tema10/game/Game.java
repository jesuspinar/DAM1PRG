package com.programacionOO.tema10.game;

import com.programacionOO.libs.Util;
import com.programacionOO.tema10.game.strategies.StrategyOnlyEven;
import com.programacionOO.tema10.game.strategies.StrategyOnlyOdd;

import java.util.Random;

public class Game {
    public enum PlayResult{
        MINOR, EQUAL,MAYOR
    }
    private Player player1;
    private Player player2;
    private Random random;
    private IPrintable iPrintable;

    public Game(String player1Name, String player2Name, IPrintable iPrintable){
        random = new Random();
        player1 = new Player(player1Name,new StrategyOnlyOdd());
        player2 = new Player(player2Name,new StrategyOnlyEven());
        this.iPrintable = iPrintable;
    }
    public void start(int minValue, int maxValue){
        int number = random.nextInt(maxValue -minValue +1)+minValue;
        player1.init(minValue,maxValue);
        player2.init(minValue,maxValue);
        iPrintable.print("Numero :" + number);
        boolean isWinner = false;
        boolean isWinner2 = false;

        do {
            isWinner = checkNumber(player1, number);
            isWinner2 = checkNumber(player2, number);
//            Util.wait(1500);

        }while (!isWinner && !isWinner2);

        if (isWinner && isWinner2){
            iPrintable.print("Empate");
        }
        else if (isWinner == true){
            iPrintable.print("Ganador");
            iPrintable.print(player1.getName());
        }
        else if (isWinner2 == true){
            iPrintable.print("Ganador");
            iPrintable.print(player2.getName());
        }
    }
    public boolean checkNumber(Player player, int number){
        int numPlayer = player.play();
        iPrintable.print(player.getName());
        if (numPlayer < number){
            player.onCheckNumber(PlayResult.MAYOR);
        }
        else if(numPlayer > number){
            player.onCheckNumber(PlayResult.MINOR);
            return true;
        }else {
            player.onCheckNumber(PlayResult.EQUAL);
        }
        return false;
    }
}
