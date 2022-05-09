package com.programacionOO.tema04.practica13;
import java.util.Random;

public class Practica13 {
    public static void main(String[] args) {
        final int RANGO = 1000000;
        Random numerRandom = new Random();
        int numeroAzar ;
        double cara = 0, cruz = 0;

        for (int i = 0; i < RANGO; i++) {
            numeroAzar = numerRandom.nextInt(2);
            if (numeroAzar == 0) {
                cara++;
            } 
            else {
                cruz++;
            }
        }
        System.out.println("La probabilidad de las caras es " + (cara/RANGO)*100 + " %");
        System.out.println("La probabilidad de las cruz es " + (cruz/RANGO)*100 + " %");
    }
}
