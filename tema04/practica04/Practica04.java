package com.programacionOO.tema04.practica04;

public class Practica04 {
    public static void main(String[] args){
        //Impares del 1-100 mostrando cuantos
        final int MAX = 100;
        for (int contador = 1; contador < MAX ; contador++) {
            if (contador % 2 != 0)
            System.out.println(contador);
        }
    }
}
