package com.programacionOO.tema07.arrayBidimesional;
public class Practica {
    // ARRAY BIDIMENSIONAL
    public static void main(String[] args) {
        
        final int ROW = 80;
        final int COL = 80;

        //RELLENA LA MATRIZ A MANO
        // int matriz[][]={{1,0,0,0},
        //                 {0,1,0,0},
        //                 {0,0,1,0},
        //                 {0,0,0,1}};
        int matriz[][] = new int[ROW][COL];

        //RELLENA LA MATRIZ Y LA MUESTRA
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if (i==j) {
                    matriz[i][j] = 1;
                }
                else{
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
}