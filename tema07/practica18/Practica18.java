package com.programacionOO.tema07.practica18;

import com.programacionOO.libs.Util;

public class Practica18{
    public static void main(String[] args) {
        final int MIN = 1;
        final int MAX = 10;
        
        int n = Util.askInteger("Introduzca una longitud para el array");
        int array[] = new int[n];
        int brray[] = new int[n];
        double sum[] = new double[n];
        double div[] = new double[n];

        array = Util.randomArrayInt(n, MIN, MAX);
        brray = Util.randomArrayInt(n, MIN, MAX);
        sum = sumArray(array, brray);
        div = divArray(array, brray);

        System.out.println("El resultado de la suma en arrays");
        Util.showArray(sum);
        System.out.println("El resultado de la suma en arrays");
        Util.showArray(div);

    }
    

    public static int[] fillArray(int size) {
        int a[] = new int[size];
        for (int i = 0; i < a.length; i++)
            a[i] = Util.askInteger("Insert value");
        return a;
    }
    public static double[] sumArray(int a[], int b[]) {
        if (a != null && b != null && a.length != b.length) 
            return null;

        double suma[] = new double[a.length];
        for (int i = 0; i < a.length; i++) 
            suma[i] = a[i] + b[i];
        return suma;
    }
    public static double[] divArray(int a[], int b[]) {
        if (a != null && b != null && a.length != b.length) 
            return null;

        double div[] = new double[a.length];
        for (int i = 0; i < a.length; i++) 
            div[i] = (double) a[i] / b[i];
        return div;
    }
}
// 18. Genera dos arrays de 10 elementos de tipo entero entre 1 y 10. Después genera
// otro array suma que sea el resultado de la suma de los elementos de los 2 arrays.
// Genera también otro array donde el valor de sus elementos sea la división de los
// elementos de los dos arrays iniciales. Consideraciones

// Crea métodos a los que le  pasaremos los dos arrays iniciales y devuelvan otro 
// con el resultado(suma o división).