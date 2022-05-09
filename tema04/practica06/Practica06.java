package com.programacionOO.tema04.practica06;

import java.util.Scanner;

public class Practica06 {
    public static void main(String[] args) {
        final int RANGO = 10;
        Scanner lector = new Scanner(System.in);
        int numero = 0;
        //int resultado = 0;

        System.out.print("\n");
        System.out.println("==*> Tablas de multiplicar del 1-10 <*==");
        System.out.println("-----------Introduce un número----------");
        numero = Integer.parseInt(lector.nextLine());
        lector.close();
        System.out.print("\n");
        
        
        // switch (numero) {
        //     case 1:
        //         for (int i = 1; i <= RANGO; i++) {
        //             resultado = numero * i;
        //             System.out.println(numero + " x " + i + " = " + resultado);
        //         }
        //         break;
        //     case 2:
        //         for (int i = 1; i <= RANGO; i++) {
        //             resultado = numero * i;
        //             System.out.println(numero + " x " + i + " = " + resultado);
        //         }
        //         break;
        //     case 3:
        //         for (int i = 1; i <= RANGO; i++) {
        //             resultado = numero * i;
        //             System.out.println(numero + " x " + i + " = " + resultado);
        //         }
        //         break;
        //     case 4:
        //         for (int i = 1; i <= RANGO; i++) {
        //             resultado = numero * i;
        //             System.out.println(numero + " x " + i + " = " + resultado);
        //         }
        //         break;
        //     case 5:
        //         for (int i = 1; i <= RANGO; i++) {
        //             resultado = numero * i;
        //             System.out.println(numero + " x " + i + " = " + resultado);
        //         }
        //         break;
        //     case 6:
        //         for (int i = 1; i <= RANGO; i++) {
        //             resultado = numero * i;
        //             System.out.println(numero + " x " + i + " = " + resultado);
        //         }
        //         break;
        //     case 7:
        //         for (int i = 1; i <= RANGO; i++) {
        //             resultado = numero * i;
        //             System.out.println(numero + " x " + i + " = " + resultado);
        //         }
        //         break;
        //     case 8:
        //         for (int i = 1; i <= RANGO; i++) {
        //             resultado = numero * i;
        //             System.out.println(numero + " x " + i + " = " + resultado);
        //         }
        //         break;
        //     case 9:
        //         for (int i = 1; i <= RANGO; i++) {
        //             resultado = numero * i;
        //             System.out.println(numero + " x " + i + " = " + resultado);
        //         }
        //         break;
        //     case 10:
        //         for (int i = 1; i <= RANGO; i++) {
        //             resultado = numero * i;
        //             System.out.println(numero + " x " + i + " = " + resultado);
        //         }
        //         break;
        //     default:
        //     System.out.println("El numero " + numero + " esta fuera del rango" );
        //         break;
        // }
        
        // opcion rapida
        for (int i = 1 ; i <= RANGO; i++){
                System.out.println(numero + " x " + i + " = " + (i * numero));
        }
    
    }
        
}