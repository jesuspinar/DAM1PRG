package com.programacionOO.tema07.practica17;

import com.programacionOO.libs.Util;

public class Practica17{
    public static void main(String[] args) {
        int n = Util.askInteger("Introduzca una longitud para el array");
        double array[] = new double[n];
        double media = 0;
        int contador = 0;

        array = fillArray(n);
        media = Util.mediaArray(array, 0);

        //calcular cuantos son superior a la media 
        for (int i = 0; i < array.length; i++) {
            if (array[i] > media) {
                contador++;
            }
        }   

        System.out.printf(
            "La media de los valores del array es = %.2f\n",
            media
        );

        System.out.printf(
            "La media fue superada por = %d valores\n",
            contador
        );
    }
    public static double[] fillArray(int size) {
        double a[] = new double[size];
        for (int i = 0; i < a.length; i++)
            a[i] = Util.askDouble("Insert value");
        return a;
    }
}
// 17. Escribe un programa que permita introducir una secuencia de N (pediremos N al
// usuario) estaturas de personas y guardarlas en un array. Calcular la media de todas
// ellas y mostrar información de cuántas de ellas tienen estatura superior a la media