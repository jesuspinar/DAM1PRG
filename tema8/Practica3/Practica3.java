package com.programacionOO.tema8.Practica3;

import com.programacionOO.libs.Util;

public class Practica3 {

    private Alumno[] alumnos = new Alumno[2];
    private Alumno alumno = new Alumno();

    private void mostrarMenu(){
        int opcion;
        do {
            System.out.println("*********************");
            System.out.println("** GESTIÓN ALUMNOS **");
            System.out.println("*********************");
            System.out.println("1. Nuevo alumno ...");
            System.out.println("2. Baja de alumno ...");
            System.out.println("3. Consultas ...");
            System.out.println("----------------------- ");
            System.out.println("0. Salir ");
            opcion = opcionMenu(Util.askInteger(""));
        }while (opcion < 0 && opcion > 3);
    }

    private int opcionMenu(int opcion){
        switch (opcion){
            case 1:
                for (int i = 0; i < alumnos.length; i++) {
                    if (alumnos[i].getNia().equalsIgnoreCase(alumno.getNia())){
                        alumno.borrar(alumno.getNia());
                        System.out.println("Intentelo otra vez");
                    }else {
                        alumnos[i] = alumno.nuevo();
                    }
                }
                break;
            case 2:
                break;
            case 3:
                alumnos.toString();
                break;
            case 0:
                break;
        }
    }
}
