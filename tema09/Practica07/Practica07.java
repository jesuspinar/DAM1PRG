package com.programacionOO.tema09.Practica07;

import java.util.Arrays;

public class Practica07 {
    public static void mostrarCadenesArray(String[] cadena){
        System.out.println(Arrays.toString(cadena));
        for (int i = 0; i < cadena.length; i++) {
//            if (cadena[i] != null)
            try {
                cadena[i] = String.valueOf(cadena[i].charAt(0));
            }catch (NullPointerException npe){
                System.out.println("Null pointer execption en posicion "+i);
            }

//            else System.out.println("Null pointer execption en posicion "+i);
        }
        System.out.println(Arrays.toString(cadena));
    }
}
