package com.programacionOO.tema04.practica15;

import java.util.Scanner;

public class Practica15 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int horas = 0, minutos = 0 , segundos = 0;

        System.out.println("Dime tu hora actual...");
        while (horas < 1 || horas > 23) {
            System.out.println("Introduce los horas");
            horas = Integer.parseInt(lector.nextLine());
        }
        while (minutos < 1 || minutos > 59) {
            System.out.println("Introduce los minutos");
            minutos = Integer.parseInt(lector.nextLine());
        }
        while (segundos < 1 || segundos > 59) {
            System.out.println("Introduce los segundos");
            segundos = Integer.parseInt(lector.nextLine());
        }
        lector.close();
        System.out.println("Parace que son las " + horas + ":"+minutos+":"+segundos);
    }
}
