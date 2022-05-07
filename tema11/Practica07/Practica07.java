package com.programacionOO.tema11.Practica07;

import com.programacionOO.libs.Ansi;
import com.programacionOO.libs.Util;
import com.programacionOO.tema11.Practica07.Practica07a.Practica07a;
import com.programacionOO.tema11.Practica07.Practica07b.Practica07b;

public class Practica07 {
    public Practica07() {
        char opcion;
        do {
            opcion = menuPrincipal();
            switch (opcion) {
                case 'a':
                    Practica07a practica07A = new Practica07a();
                    break;
                case 'b':
                    Practica07b practica07B = new Practica07b();
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
