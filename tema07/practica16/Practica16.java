package com.programacionOO.tema07.practica16;

import com.programacionOO.libs.Util;

public class Practica16{
    public static void main(String[] args) {
        final int NOTAMIN = 0;
        final int NOTAMAX = 10;
        final int APROBADO = 5;
        
        int n = Util.askInteger("Introduzca una longitud para el array");
        double array[] = new double[n];

        array = randomArrayDouble(n, NOTAMIN, NOTAMAX);

        // Util.showArray(array);

        System.out.printf(
            "La media de los aprobados del array es = %.2f\n",
            mediaArray(array, APROBADO)
        );
        System.out.printf(
            "La media de los valores del array es = %.2f\n",
            mediaArray(array, 0)
        );


    }
    /**
     * @return random double array
    */
    public static double[] randomArrayDouble(int size, int min, int max) {
        double a[] = new double[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = Util.random(min, max);
        }
        return a;
    }
    public static double mediaArray(double[] a, int rate) {
        double result = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= rate) {
                result = a[i] + result;
            }
        }
        return result / a.length;
    }
}
// 16. Escribe un programa que permita generar una secuencia de 30 números aleatorios
// de tipos double entre 0 y 10 (imagina que son notas de alumnos) y los almacene en un array.
// Calcula e imprime la media de aquellos elementos mayores o iguales que 5 y también la media total