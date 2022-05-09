package com.programacionOO.tema04.practica14;
import java.util.Random;
public class Practica14 {
    public static void main(String[] args) {
        final int RANGO = 1000000;
        Random numerRandom = new Random();
        int numeroAzar ;
        double uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0, seis = 0;

        for (int i = 0; i < RANGO; i++) { //(max - min + 1) + min;
            numeroAzar = numerRandom.nextInt(6 - 1 + 1) + 1;
            switch (numeroAzar) {
                case 1: uno++; break;
                case 2: dos++; break;
                case 3: tres++; break;
                case 4: cuatro++; break;
                case 5: cinco++; break;
                case 6: seis++; break;
            }
        }
        System.out.println("La probabilidad del uno es " + (uno/RANGO)*100 + " %");
        System.out.println("La probabilidad del dos es " + (dos/RANGO)*100 + " %");
        System.out.println("La probabilidad del tres es " + (tres/RANGO)*100 + " %");
        System.out.println("La probabilidad del cuatro es " + (cuatro/RANGO)*100 + " %");
        System.out.println("La probabilidad del cinco es " + (cinco/RANGO)*100 + " %");
        System.out.println("La probabilidad del seis es " + (seis/RANGO)*100 + " %");
    }
}
