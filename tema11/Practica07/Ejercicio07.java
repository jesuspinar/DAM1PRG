package com.programacionOO.tema11.Practica07;

import com.programacionOO.libs.Ansi;
import com.programacionOO.libs.Util;
import com.programacionOO.tema11.Practica07.Ejercicio07a.Ejercicio07a;
import com.programacionOO.tema11.Practica07.Ejercicio07b.Ejercicio07b;

public class Ejercicio07 {
    public Ejercicio07() {
        char opcion;
        do {
            opcion = menuPrincipal();
            switch (opcion) {
                case 'a':
                    Ejercicio07a ejercicio07a = new Ejercicio07a();
                    break;
                case 'b':
                    Ejercicio07b ejercicio07b = new Ejercicio07b();
                    break;

                case 'c':
                    System.out.println("Hasta pronto");
                    break;
            }
        } while (opcion != 'c');
    }

    private char menuPrincipal() {
        char opcion = ' ';

        do {
            Ansi.clearScreen();
            System.out.println("****************");
            System.out.println("* ELIJA OPCIÓN *");
            System.out.println("****************");
            System.out.println("a. Un estadio diferente para cada partido...");
            System.out.println("b. El estadio es el mismo para todos los partidos...");
            System.out.println("----------------------");
            System.out.println("c. Salir\n");
            System.out.println("Elija una opción: ");
            opcion = Util.lector.nextLine().charAt(0);
            if (opcion < 'a' || opcion > 'c') {
                System.out.println("Elija una opción del menú");
                Util.pausa();
            }
        } while (opcion < 'a' || opcion > 'c');
        return opcion;
    }
}
