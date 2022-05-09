package com.programacionOO.tema04salida.practica08;

public class Practica08 {
    public static void main(String[] args) {
        String escape = "\u001B[";
        int negrita = 0;
        int texto = 0;
        int fondo = 0;
        //c es las veces se que se imprime cada linea de color
        int c= 0;
        do {
            for (int j = 1; j <= 8; j++) {
                //incremento de color
                fondo = j - 1;
                System.out.printf(escape+""+negrita+";3"+texto+";4"+fondo+"m%10s"+escape+"0m",""+negrita+";3"+texto+";4"+fondo+" ");
            }
            c++;
            fondo = 0;
            texto++;
            System.out.println();

            //Cuando se an impreso 7 filas 
            //las siguiente son en negrita
            if(texto > 7){
                texto=0;
                fondo=0;
                if (negrita==0)
                negrita = 1;
            }
        } while (c < 16);
    }
}
