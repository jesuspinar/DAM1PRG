package com.programacionOO.tema07.practica19;

import com.programacionOO.libs.Util;

public class Practica19{
    public static void main(String[] args) {
        final int MIN = 0;
        final int MAX = 100;
        
        int n = Util.askInteger("Introduzca una longitud para el array");
        int array[] = new int[n];

        array = Util.randomArrayInt(n, MIN, MAX);

        printMultiploArray(array, 5);
        printMultiploArray(array, 0);
        printMultiploArray(array, 10);
    }
    
    
    public static void printMultiploArray(int a[], int multi) {
        for (int i = 1; i < a.length; i++) {
            if (multi != 0 && a[i] % multi == 0 ) {
                System.out.printf("En la posicion %d se encuntra %d  que es multiplo de %d \n",
                i , a[i], multi);
            }
            if (multi == 0) {
                System.out.printf("En la posicion %d se encuntra %d  que es multiplo de %d \n",
                i, 0, 0);
            }
        }
    }

    public static void printMultiplo5(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 5 == 0) {
                System.out.printf("El %d es multiplo de %d \n", a[i],5);
            }
        }
    }
    public static void printMultiplo0(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                System.out.printf("El %d es multiplo de %d \n", a[i], 0);
            }
        }
    }
    public static void printMultiplo10(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 10 == 0) {
                System.out.printf("El %d es multiplo de %d \n", a[i], 10);
            }
        }
    }
}
// 19. Genera un array de 100 enteros entre 0 y 100 (aleatorios) y crea 3 métodos 
// que impriman los que son múltiplos de 5, los que son 0 y los que son múltiplos de 10
