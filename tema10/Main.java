package com.programacionOO.tema10;

import com.programacionOO.tema09.Practica10.Practica10;
import com.programacionOO.tema10.Practica01.Practica01;
import com.programacionOO.tema10.game.Game;
import com.programacionOO.tema10.game.IPrintable;

//public class Main implements IPrintable {
//    public static void main(String[] args) {
//        Main main = new Main();
//        Game game = new Game("Joan","Pepe",main);
//        game.start(2,100);
//    }
//    @Override
//    public void print(String message) {
//        System.out.println(message);
//    }
//}
public class Main {
    public static void main(String[] args) {
        Practica01 practica01 = new Practica01();
        int[] test = {1,2,3,4,5,6,7};
        practica01.evenOddList(test);
        System.out.println(practica01.toString());

    }
}
