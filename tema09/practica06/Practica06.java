package com.programacionOO.tema09.practica06;

public class Practica06 {
    private int entero ;
    private int[] enteros ;

    public Practica06(int entero, int[] enteros) {
        dividirEntreArray(entero,enteros);
    }

    /**
     * Prints arrays division
     * @param num
     * @param array
     */
    public static void dividirEntreArray(int num , int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 )
                System.out.println((float)num / array[i]);
            else System.out.println("No se puede dividir en la posicion " + i);
        }
    }
}
