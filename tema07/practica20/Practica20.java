package com.programacionOO.tema07.practica20;

import java.util.Arrays;

public class Practica20{
    public static void main(String[] args) {
        int array[] = {10,25,23,14,85,65};
        int num = 14;
        boolean check = contains(array, num);

        System.out.printf("Array contains %d ?\n%b\n",num, check);
    }
    /**
     * Check every array i -> i possitions util finds number
     * @param array input array
     * @param num int to search into array
     * @return true or false if int is in the array
    */
    public static boolean contains(final int[] array, final int num) {
        return Arrays.stream(array).anyMatch(i -> i == num);
    }
}
// 20. Genera un método al que le pasaremos un array y un número y nos 
// devuelva si ese número estáen el array