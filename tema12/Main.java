package com.programacionOO.tema12;

import com.programacionOO.tema12.practica01.Practica01;
import com.programacionOO.tema12.practica02.Practica02;
import com.programacionOO.tema12.practica03.Practica03;
import com.programacionOO.tema12.practica04.Practica04;
import com.programacionOO.tema12.practica05.GestionarArchivos;
import com.programacionOO.tema12.practica09.Practica09;
import com.programacionOO.tema12.practica13.Practica13;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("Please enter an string");
            System.exit(0);
        }
//        Practica01 practica01 = new Practica01(args[0]);
//        Practica02 practica02 = new Practica02(args[0]);
//        Practica03 practica03 = new Practica03(args[0]);
//        Practica04 practica04 = new Practica04(args[0]);
//
//        String[] alumnos = {"Jose","Aurelio","Vicenta","Sofia","Sergio"};
//        if(Practica09.insertarAlumnos(args[0],alumnos)) System.out.println("Escritura completada");
//        if(Practica09.eliminarAlumno(args[0],"Vicenta")) System.out.println("Borrado completado");

        Practica13 practica13 = new Practica13(args[0]);

    }
}
