package com.programacionOO.tema12.practica14;

import java.io.*;
import java.lang.reflect.Array;

/*
* 14. Crea un método que reciba como parámetros dos archivos,
* compare su contenido e indique si son iguales o no.
*/
public class Practica14 {
    public Practica14() {
    }

    /**
     * Comparaes to files content
     * @param file1
     * @param file2
     * @return
     */
    public static boolean compararFicheros(String file1, String file2){
        byte[] a;
        byte[] b;
        try(
                DataInputStream dsFile1 = new DataInputStream(new FileInputStream(file1));
                DataInputStream dsFile2 = new DataInputStream(new FileInputStream(file2));
            )
        {
            a = dsFile1.readAllBytes();
            b = dsFile2.readAllBytes();

            if (a.length != b.length){return false;}
            else{
                for (int i = 0; i < a.length; i++) {
                    if(a[i] != b[i]) return false ;
                }
                return true;
            }

        }catch (IOException ioe){
            System.err.println("Fallo en la lectura");
            return false;
        }
    }
}
