package com.programacionOO.tema06.practicaExtra;

import com.programacionOO.libs.Ansi;

public class Television {
    public static void main(String[] args) {
        final int NUM_ROWS = 20 ;
        final int NUM_COLS= 20;
        final int COL = 10 ;
        final int ROW = 5 ;

        Ansi.clearScreen();
        while (true) {
            
            for (int y = 0; y < NUM_ROWS; y++) {
                for (int x = 0; x < NUM_COLS; x++) {
                    if (y == ROW || y == NUM_ROWS + ROW - 1) {
                        Ansi.printTo(' ', x,y,false,
                        Ansi.Color.YELLOW,//para el fondo
                        Ansi.Color.NONE);//para el texo
                    }
                    else if (x == COL || x == NUM_COLS + COL - 1 ) {
                        Ansi.printTo(' ', x,y,false,
                        Ansi.Color.NONE,//para el fondo
                        Ansi.Color.YELLOW);//para el texo
                    } else {
                        Ansi.printTo(' ', x,y,false,
                        Ansi.Color.NONE,//para el fondo
                        Ansi.randomC());//para el texo
                    }
                }
            }
        }
    }
}

