package com.programacionOO.tema07.practica15;

import com.programacionOO.libs.Util;

public class Practica15{
    public static void main(String[] args) {
        int n = Util.askInteger("Type length for one array");
        double array[] = new double[n];

        System.out.println(tabularArray(array, 4, 10));
    }

    public static String tabularArray(double a[], int nColumnas, int ancho){
        StringBuilder result = new StringBuilder();
        String format = "%0" + ancho + ".2f";
        int cont = 0;

        if (a == null || nColumnas <= 0) {
            return null;
        }

        for (int i = 0; i < a.length; i++) {
            result.append(String.format(format, a[i]));
            cont++;
            if (cont == nColumnas) {
                result.append("\n");
                cont = 0;
            } 
            
        }
        return result.toString();
    }
}
// 15. Escribe un programa que permita introducir un array de 20
// elementos numéricos y visualizarlos de 4 en 4 en una tabla tabulada.