package com.programacionOO.tema04.practica08;

public class Practica08 {
    public static void main(String[] args) {
        
        int numero = 5;
        int finalNumero = numero;
        
        while (numero > 1) {
            numero--;
            finalNumero = finalNumero * numero ;
            System.out.println(numero);
            
        }
        System.out.println(finalNumero);
    }
}
