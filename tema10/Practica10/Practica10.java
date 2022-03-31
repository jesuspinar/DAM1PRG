package com.programacionOO.tema10.Practica10;

import com.github.javafaker.Faker;
import com.programacionOO.libs.MenuBuilder;
import com.programacionOO.tema10.Practica10.employExceptions.NotEmployeException;

import java.util.Locale;

public class Practica10 {
    private final String menuMain = "Gestión empleados";
    private final String[] menuMainOp = {
            "Nuevo empleado",
            "Nuevo hijo",
            "Modificar sueldo",
            "Borrar empleado",
            "Borrar hijo",
            "Consultas"};
    private final String menuConsultas = "Consulatas empleados";
    private final String[] menuConsultasOp = {
            "Buscar por NIF",
            "Buscar por nombre",
            "Buscar por rango de edad",
            "Buscar por rango de sueldo",
            "Buscar por hijos menores de edad"};

    private GestorDatos gestorDatos;

    public Practica10(int intit) throws NotEmployeException {
        gestorDatos = new GestorDatos(intit);
        int opcion = 0;
        do {
            opcion = MenuBuilder.printMenu(menuMainOp,menuMain);
            switch (opcion){
                case 1: //todo : Nuevo empleado
                    gestorDatos.nuevoEmpleado();
                    break;
                case 2: //todo : Nuevo hijo
                    gestorDatos.nuevoHijo();
                    break;
                case 3: //todo : Modificar sueldo
                    gestorDatos.modificarSueldo();
                    break;
                case 4: //todo : Borrar empleado
                    gestorDatos.borrarEmpleado();
                    break;
                case 5: //todo : Borrar hijo
                    gestorDatos.borrarHijo();
                    break;
                case 6:
                    int opcionConsultas = 0;
                    do {
                        opcionConsultas = MenuBuilder.printMenu(menuConsultasOp,menuConsultas);
                        switch (opcionConsultas){
                            case 1: //todo : Buscar por NIF
                                break;
                            case 2: //todo: Buscar por nombre
                                break;
                            case 3://todo: Buscar por rango de edad.
                                break;
                            case 4: //todo : Buscar por rango de sueldo.
                                break;
                            case 5://todo : Buscar por hijos menores de edad
                                break;
                        }
                    }while (opcionConsultas != 0);
                break;
            }
        }while (opcion != 0);
        System.out.println("Hasta pronto !!");

    }

}

