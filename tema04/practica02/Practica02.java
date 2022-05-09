package com.programacionOO.tema04.practica02;

public class Practica02 {
    public static void main(String[] args){
        int acumulado = 0;
        for (int contador = 1; contador <= 1000; contador++) {
            acumulado = acumulado + contador;
        }
        System.out.println("El resultado del acumulado de 1 - 1000 es : " + acumulado);
    }
}
