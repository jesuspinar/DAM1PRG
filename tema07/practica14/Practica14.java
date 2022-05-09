package com.programacionOO.tema07.practica14;

import com.programacionOO.libs.Util;

public class Practica14{
    public static void main(String[] args) {
        int n = Util.askInteger("Type length for one array");
        char array[] = new char[n];

        array = insertCArray(n);
        showParArray(array);
        showImparArray(array);
    }

    public static char[] insertCArray(int arrayLength){
        char a[] = new char[arrayLength];
        for (int i = 0; i < a.length; i++) {
            a[i] = Util.askString("Insert value for position " + i).toCharArray()[0];
        }
        return a;
    }
    public static void showParArray(char a[]){
        System.out.printf("Value of possition numbers Par[");
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                System.out.printf(" %c",a[i]);
            }
        }
        System.out.printf(" ]\n");
    }
    public static void showImparArray(char a[]){
        System.out.printf("Value of possition numbers Impar[");
        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0) {
                System.out.printf(" %c",a[i]);
            }
        }
        System.out.printf(" ]\n");
    }
}
// 14. Escribe un programa que permita introducir un array de 10 elementos
// de tipos char y después visualizar los que ocupan la posición par. 
// Repetir para las posiciones impar.