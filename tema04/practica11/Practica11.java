package com.programacionOO.tema04.practica11;

import java.util.Scanner;

public class Practica11 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero, resultado = 0;
        int contador = 0;
        System.out.println("Calcularemos la media de todos cuando escribas numero negativo ");
        do {
            System.out.println("Añade un numero");
            numero = Integer.parseInt(lector.nextLine());
            //suma de los numeros 
            resultado = resultado + numero;
            //incremento
            contador ++;

        } while (numero >= 0);
        lector.close();
        System.out.println("El resultado es " + resultado / contador);


    }
}
