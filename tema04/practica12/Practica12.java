package com.programacionOO.tema04.practica12;
import java.util.Scanner;
import java.util.Random;

public class Practica12 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        final int RANGOFINAL = 100;
        final int RANGOINICIAL = 1;
        int numeroUsuario = 0;
        int intentos = 0;
        int numeroAzar = 0;

        //Selecion de un numero azar
        Random numeroRandom = new Random ();
        numeroAzar = numeroRandom.nextInt((RANGOFINAL - RANGOINICIAL +1) + RANGOINICIAL);
        // System.out.println(numeroAzar);

        System.out.println("Vamos a jugar a las adivinanzas elige un número entre " + RANGOINICIAL +"-"+RANGOFINAL );
        do {
            System.out.println("Elige la cantidad de intentos que tendras (max 20)");
            intentos = Integer.parseInt(lector.nextLine());
        } while (intentos != 0 && intentos < 0 && intentos <= 20);

        //empieza el juego
        while (intentos > 0) {
            System.out.println("Elige un numero");
            numeroUsuario = Integer.parseInt(lector.nextLine());
            intentos--;

            if (numeroUsuario == numeroAzar) {
                System.out.println("Enhorabuena ganaste");
                intentos = 0;
            }
            else{
                System.out.println("No es el correcto intenta otra vez");
                if (numeroUsuario < numeroAzar) {
                    System.out.println("El número es que tiene que adivinar es mayor a " + numeroUsuario);
                }
                else{
                    System.out.println("El número es que tiene que adivinar es menor a " + numeroUsuario);
                }
            }
        }
        lector.close();
        System.out.println("El numero correcto es " + numeroAzar);


    }
}
