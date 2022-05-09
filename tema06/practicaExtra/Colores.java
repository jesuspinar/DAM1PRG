package com.programacionOO.tema06.practicaExtra;

import com.programacionOO.libs.Ansi;
import com.programacionOO.libs.Util;

public class Colores { 
    final static String ESC = "\u001b[";
    final static String ESCFINAL = "\u001B[0m";
    public static void main(String[] args)  {
        //Importar la clase random
        //Crea bucle while true
        //Crea cuadro 80colums x 25filas

        while (true) {
            String blank = " ";
            int color ;
            int columnas = 80;
            int filas = 25;
            int espera = 500;//en milisegundos

            //Crea un spacio superior despues de limpiar la pantalla
            Ansi.clearScreen();
            System.out.printf("\n\n\n\n\n\n\n\n\n");
            
            //Bucle para filas 
            for (int i = 0; i < filas; i++) {
                System.out.printf("%20s",blank);
                ////Bucle para columnas 
                for (int j = 0; j < columnas; j++) {
                    color = Util.random(1, 7);
                    System.out.printf(ESC + "1;32;4"+color+"m" + "%s"+ ESCFINAL,blank);
                }
                System.out.println();
            }
            //Crea un spacio inferior espera a que este impreso todo
            System.out.printf("\n\n\n\n\n\n\n\n\n");
            Ansi.wait(espera);
            
            

        }
    }
}
