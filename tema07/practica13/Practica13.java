package com.programacionOO.tema07.practica13;

import com.programacionOO.libs.Util;

public class Practica13{
    public static void main(String[] args) {
        int n = Util.askInteger("Introduzca una longitud para el array");
        int array[] = new int[n];
        //rellenar array 
        array = insertArray(n);
        //mostrar el valor
        showArray(array);
        calcArray(array);

    }
    public static void showArray(int a[]){
        System.out.printf("[");
        for (int i = 0; i < a.length; i++) {
            System.out.printf(" %d",a[i]);
        }
        System.out.printf(" ]\n");
    }
    public static int[] insertArray(int arrayLength){
        int a[] = new int[arrayLength];
        for (int i = 0; i < a.length; i++) {
            a[i] = Util.askInteger("Insert value for position " + i);
        }
        return a;
    }
    public static void calcArray(int a[]){
        double r = 0;
        for (int i = 0; i < a.length; i++) {
            r += a[i];
        }
        r = r/a.length;
        System.out.printf("La media segun el valor de las posiciones : %.2f\n", r);
    }
}
//13. Escribe un programa para introducir los valores de un array de 10 elementos numéricos 
// posteriormente visualizar-los y saber la media de los elementos.