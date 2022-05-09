package com.programacionOO.tema10.practica10;

import com.programacionOO.libs.MenuBuilder;
import com.programacionOO.libs.Util;
import com.programacionOO.tema10.practica10.employExceptions.NotEmployeException;
import com.programacionOO.tema10.anexoIterator.InvalidRangeException;

public class Practica10 {
    private final String menuMain = "Gestión empleados";
    private final String[] menuMainOp = {
            "Nuevo empleado",
            "Nuevo hijo",
            "Modificar sueldo",
            "Borrar empleado",
            "Borrar hijo",
            "Consultas"};
    private final String menuConsultas = "Consultas empleados";
    private final String[] menuConsultasOp = {
            "Buscar por NIF",
            "Buscar por nombre",
            "Buscar por rango de edad",
            "Buscar por rango de sueldo",
            "Buscar por hijos menores de edad"};

    private GestorDatos gestorDatos;

    public Practica10(int intit) throws NotEmployeException, InvalidRangeException {
        gestorDatos = new GestorDatos(intit);
        int opcion = 0;
        do {
            opcion = MenuBuilder.printMenu(menuMainOp,menuMain);
            switch (opcion){
                case 1: //Nuevo empleado
                    if (gestorDatos.nuevoEmpleado()){
                        System.out.println("Empleado añadido correctamente !");
                    }else {
                        System.out.println("Error al añadir empleado, intentelo de nuevo");
                    }
                    break;
                case 2: //Nuevo hijo
                    if (gestorDatos.nuevoHijo()){
                        System.out.println("Hijo añadido correctamente !");
                    }else {
                        System.out.println("Error al añadir hijo, intentelo de nuevo");
                    }
                    break;
                case 3: //Modificar sueldo
                    if (gestorDatos.modificarSueldo()){
                        System.out.println("Sueldo modificado correctamente !");
                    }else {
                        System.out.println("Error al modificar, intentelo de nuevo");
                    }
                    break;
                case 4: //Borrar empleado
                    if (gestorDatos.borrarEmpleado()){
                        System.out.println("Empleado borrado correctamente !");
                    }else {
                        System.out.println("Error al borrar empleado, intentelo de nuevo");
                    }
                    break;
                case 5: //Borrar hijo
                    if (gestorDatos.borrarHijo()){
                        System.out.println("Hijo borrado correctamente !");
                    }else {
                        System.out.println("Error al borrar Hijo, intentelo de nuevo");
                    }
                    break;
                case 6:
                    int opcionConsultas = 0;
                    do {
                        opcionConsultas = MenuBuilder.printMenu(menuConsultasOp,menuConsultas);
                        switch (opcionConsultas){
                            case 1: //Buscar por NIF
                                String nif = Util.askString("Introduzaca NIF empleado?");
                                System.out.println(gestorDatos.busquedaEmpleado(nif));
                                break;
                            case 2: //todo: Buscar por nombre
                                String nombre = Util.askString("Introduzaca NIF empleado?");
                                System.out.println(gestorDatos.busquedaNombres(nombre).toString());
                                break;
                            case 3://todo: Buscar por rango de edad.
                                int minEdad = Util.askInteger("Edad minima ?");
                                int maxEdad = Util.askInteger("Edad maxima ?");
                                System.out.println(gestorDatos.busquedaEdad(minEdad,maxEdad));
                                break;
                            case 4: //todo : Buscar por rango de sueldo.
                                int minSueldo = Util.askInteger("Sueldo minimo ?");
                                int maxSueldo = Util.askInteger("Sueldo maximo ?");
                                System.out.println(gestorDatos.busquedaSueldo(minSueldo,maxSueldo));
                                break;
                            case 5://todo : Buscar por hijos menores de edad
                                gestorDatos.mostrarHijosMenores();
                                break;
                        }
                    }while (opcionConsultas != 0);
                break;
            }
        }while (opcion != 0);
        System.out.println("Hasta pronto !!");

    }

}

