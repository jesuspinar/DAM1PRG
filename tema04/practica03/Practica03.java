package com.programacionOO.tema04.practica03;

import java.util.Scanner;
public class Practica03 {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        int numero1, numero2, acumulado = 0;

        System.out.println("===> Vamos a calcular el producto de dos números <===");
        System.out.println("Escribe un número entero");
        numero1 = Integer.parseInt(lector.nextLine());
        System.out.println("Escribe otro número");
        numero2 = Integer.parseInt(lector.nextLine());
        lector.close();
        
        //contador en el bucle for actua como multiplicacion 
        for (int contador = 1 ; contador <= numero1; contador++) {
            acumulado = acumulado + numero2;
        }
        System.out.println("El resultado es : " + acumulado);
    }
    
}
