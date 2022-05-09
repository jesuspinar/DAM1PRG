package com.programacionOO.tema07.piedraPapelTijera;

import com.programacionOO.libs.Ansi;
import com.programacionOO.libs.Util;

public class Main {
    enum Obj{
        NULL, PIEDRA, PAPEL, TIJERA
    }
    // CONTANTES GLOBALES
    final static int PIEDRA = 1, PAPEL = 2, TIJERA = 3;
    // VARIABLES GLOBALES
    public static int pointsPlayer = 0; 
    public static int pointsCPU = 0;
    public static int draw = 0;
    public static void main(String[] args) {
        //CONSTANTES LOCALES
        final int MILISEC = 400;
        final int MINOPT = 1;
        final int MAXOPT = 3;
        //VARIABLES LOCALES
        int exit = 0;
        int player;
        int cpu;
        
        do {
            showMenu();
            exit = Util.askInteger("Elige una opción:");
            switch (exit) {
                case 1:
                    Ansi.wait(MILISEC);
                    selectWeapon();
                    do{   
                        player = Util.askInteger("Indica tú elección:"); 
                    }while (player < MINOPT && player > MAXOPT);
                    
                    System.out.println("La CPU esta eligiendo...");
                    cpu = Util.random(MINOPT, MAXOPT);
                    Ansi.wait(MILISEC);
        
                    printWeapon(player, cpu);
                    Ansi.wait(MILISEC);
                    repartoPuntos(player, cpu);

                    Ansi.clearScreen();
                break;
                    
                case 2:
                    printResult();
                    Ansi.clearScreen();
                break;
            }
        } while (exit != 0);
    }
    public static void printResult() {
        System.out.println("***** PUNTUACIONES ******");
        System.out.printf("Victorias Player: %5d", pointsPlayer);
        System.out.printf("\nVictorias CPU: %8d", pointsCPU);
        System.out.printf("\nEmpatadas: %12d\n", draw);

    }
    public static int repartoPuntos(int player, int cpu) {
        if (player == cpu) {
            System.out.println("\nVaya.. empate...");
            return draw++;
        }
        else if (player == PIEDRA && cpu == TIJERA) {
            System.out.println("\nHas ganado!! ");
            System.out.println("La " + Obj.PIEDRA + " rompe la " + Obj.TIJERA);
            return pointsPlayer++;
        }
        else if(player == PAPEL && cpu == PIEDRA){
            System.out.println("\nHas ganado!! ");
            System.out.println("El " + Obj.PAPEL + " envuelve la " + Obj.PIEDRA);
            return pointsPlayer++;
        }
        else if(player == TIJERA && cpu == PAPEL){
            System.out.println("\nHas ganado!! ");
            System.out.println("La " + Obj.TIJERA + " corta el " + Obj.PAPEL);
            return pointsPlayer++;
        }
        else{
            System.out.println("\nOtra vez sera ... Gana la CPU");
            return pointsCPU++;
        }
    }
    public static void showMenu(){
        System.out.println("===========================");
        System.out.println("  PIEDRA, PAPEL O TIJERAS  ");
        System.out.println("===========================");
        System.out.println("1. Nueva Partida ...");
        System.out.println("2. Mostrar puntuaciones ...");
        System.out.println("---------------------------");
        System.out.println("0. Salir");
    }
    public static void selectWeapon(){
        System.out.println("***********");
        System.out.println("*  ELIGE  *");
        System.out.println("***********");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijeras\n");
    }
    public static void printWeapon(int player, int cpu){
        switch (player) {
            case PIEDRA:  
                System.out.println("\nElegiste " + Obj.PIEDRA);
                System.out.println(" \n  ____ \n /    \\\n \\____/");
            break;
            case PAPEL: 
                System.out.println("\nElegiste " + Obj.PAPEL);
                System.out.println("\n________\n|      |\n|      |\n|      |\n|______|");
            break;
            case TIJERA: 
                System.out.println("\nElegiste " + Obj.TIJERA);
                System.out.println("\n  0  /\n   \\/\n   /\\\n  0  \\");
            break;   
        }
        switch (cpu) {
            case PIEDRA:  
                System.out.println("\nLa CPU " + Obj.PIEDRA);
                System.out.println(" \n  ____ \n /    \\\n \\____/");
            break;
            case PAPEL: 
                System.out.println("\nLa CPU " + Obj.PAPEL);
                System.out.println("\n________\n|      |\n|      |\n|      |\n|______|");
            break;
            case TIJERA: 
                System.out.println("\nLa CPU " + Obj.TIJERA);
                System.out.println("\n  0  /\n   \\/\n   /\\\n  0  \\");
            break;   
        }
    }
}