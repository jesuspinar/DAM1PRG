package com.programacionOO.tema10.practica11;

import com.programacionOO.libs.MenuBuilder;
import com.programacionOO.tema10.practica11.Controlador.Centro;
import com.programacionOO.tema10.anexoIterator.InvalidRangeException;

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

    private Centro centro;

    public Practica11(int init) throws InvalidRangeException {

        centro = new Centro(init);
        int opcion = 0;
        do {
            opcion = MenuBuilder.printMenu(menuMainOp,menuMain);
            switch (opcion){
                case 1://todo : registrar nuevo alumno
                    if (centro.nuevoAlumno()){
                        System.out.println("Alumno creado correctamente !!");
                    }
                    break;
                case 2: //todo : registrar nueva asignatura
                    break;
                case 3: //todo : registrar nuevo grupo
                    break;
                case 4: //todo : registrar nuevo profesor
                    break;
                case 5:
                    int opcionConsultas = 0;
                    do {
                        opcionConsultas = MenuBuilder.printMenu(menuConsultasOp,menuConsultas);
                        switch (opcionConsultas){
                            case 1://todo : mostrar alumnos por grupo
                                break;
                            case 2: System.out.println(centro.mostrarAlumnos());break;
                            case 3: System.out.println(centro.mostrarProfesores());break;
                        }
                    }while (opcionConsultas != 0);
                break;
            }
        }while (opcion != 0);
        System.out.println("Hasta pronto !!");

    }
}
