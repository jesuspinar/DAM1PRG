package com.programacionOO.tema10.Practica11;

import com.programacionOO.libs.MenuBuilder;
import com.programacionOO.tema10.Practica11.Controlador.Centro;

public class Practica11 {
    private final String menuMain = "Gestión Centro Educativo";
    private final String[] menuMainOp = {
            "Nuevo alumno",
            "Nueva asignatura",
            "Nuevo grupo",
            "Nuevo profesor",
            "Consultas"};
    private final String menuConsultas = "Consultas Centro";
    private final String[] menuConsultasOp = {
            "Mostrar alumnos por grupo",
            "Mostrar alumnos",
            "Mostrar profesores"};

    private Centro nuevoCentro;

    public Practica11(int init) {

        nuevoCentro = new Centro(init);
        int opcion = 0;
        do {
            opcion = MenuBuilder.printMenu(menuMainOp,menuMain);
            switch (opcion){
                case 1: ;break;
                case 2: ;break;
                case 3: ;break;
                case 4: ;break;
                case 5:
                    int opcionConsultas = 0;
                    do {
                        opcionConsultas = MenuBuilder.printMenu(menuConsultasOp,menuConsultas);
                        switch (opcionConsultas){
                            case 1: ;break;
                            case 2: System.out.println(nuevoCentro.mostrarAlumnos());break;
                            case 3: System.out.println(nuevoCentro.mostrarProfesores());break;
                        }
                    }while (opcionConsultas != 0);
                break;
            }
        }while (opcion != 0);
        System.out.println("Hasta pronto !!");

    }
}
