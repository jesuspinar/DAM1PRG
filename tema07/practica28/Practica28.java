package com.programacionOO.tema07.practica28;

import com.programacionOO.libs.Util;

public class Practica28 {
    public static final int MIN_VALUE = (int)'A';
    public static final int MAX_VALUE = (int)'Z';
    public static final int NUM_LETTERS = 500;
    public static void main(String[] args) {
        int repeticiones[] = new int[MAX_VALUE-MIN_VALUE+1];
        char letras[] = new char[NUM_LETTERS];
        for (int i = 0; i < letras.length; i++) {
            char letra = (char) Util.random(MIN_VALUE, MAX_VALUE);
            letras[i] = letra;
            repeticiones[letra - MIN_VALUE]++;
        }
        for (int i = 0; i < letras.length; i++) {
            System.out.printf("%c ==> %d\n", (char)(i + MIN_VALUE), repeticiones[i]);
        }
    }
}
// 28. Crea un array de 500 letras mayúsculas aleatorias y después, 
// con un método, obtener una tabla similar a la siguiente donde 
// el número representa el número a veces que se repite cada letra.
// A -->25
// B -->10
// ......
// Z -->12
// SUGERENCIA: Para transformar un entero en una letra: (char)numAleatori