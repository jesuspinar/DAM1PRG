package com.programacionOO.tema09.Practica06;

import java.util.Arrays;

public class Practica06 {
    private int entero ;
    private double[] enteros ;

    public Practica06(int entero, double[] enteros) {
        dividirEntreArray(entero,enteros);
    }

    public static void dividirEntreArray(int num , double[] array){
        double[] divididos = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 )
            divididos[i] =  num / array[i];
            else System.out.println("No se puede dividir en la posicion " + i);
        }
        System.out.println(Arrays.toString(divididos));
    }
}
