package com.programacionOO.tema09;

import com.programacionOO.libs.Util;
import com.programacionOO.tema09.Practica01.Practica01;
import com.programacionOO.tema09.Practica02.Practica02;
import com.programacionOO.tema09.Practica03.Practica03;
import com.programacionOO.tema09.Practica05.Practica05;
import com.programacionOO.tema09.Practica06.Practica06;
import com.programacionOO.tema09.Practica07.Practica07;
import com.programacionOO.tema09.Practica08.Practica08;
import com.programacionOO.tema09.Practica10.Practica10;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        Practica01 a = new Practica01(10);
//        Practica02 a = new Practica02(5);
//        Practica03 a = new Practica03(5);
//        practica05();
//        practica06();
//        practica07();
//        Practica08 s = new Practica08();
        Practica10 s = new Practica10();
    }

    private static void practica05(){
        String nombre = Util.askString("nombre?");
        int edad= Util.askInteger("edad?");
        double altura = Util.askDouble("altura'");

        String nombre2 = Util.askString("nombre?");
        int edad2= Util.askInteger("edad?");
        double altura2 = Util.askDouble("altura'");

        Practica05[] alumno = new Practica05[2];

        alumno[0] = new Practica05(nombre,edad,altura);
        alumno[1] = new Practica05(nombre2,edad2,altura2);


        if(alumno[0].getEdad() > alumno[1].getEdad()) {
            System.out.println("Es mayor " + alumno[0]);
        }else{
            System.out.println("Es mayor " + alumno[1]);
        }
    }

    private static void practica06(){
        int[] array = {-2,-1,0,1,2};
        int num = 2;
        Practica06 p06 = new Practica06(num,array);
    }

    private static void practica07(){
        Practica07 p07 = new Practica07();
        String[] s = {"hola","que","tal?"};
        String[] fallo = {"hola",null,"tal?"};
        p07.mostrarCadenesArray(s);
        p07.mostrarCadenesArray(fallo);
    }
}
