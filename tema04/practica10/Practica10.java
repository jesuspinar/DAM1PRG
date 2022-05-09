package com.programacionOO.tema04.practica10;
import java.util.Scanner;

public class Practica10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero, resultado = 0;
        System.out.println("Iremos sumando hasta que escribas 0 ");
        do {
            System.out.println("Introduce un numero");
            numero = Integer.parseInt(lector.nextLine());
            resultado = resultado + numero;

        } while (numero != 0);
        lector.close();
        System.out.println("El resultado del sumatorio es " + resultado);


    }
}
