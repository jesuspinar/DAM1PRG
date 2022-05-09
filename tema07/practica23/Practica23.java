package com.programacionOO.tema07.practica23;

import com.programacionOO.libs.Util;

public class Practica23{
    public static void main(String[] args) {
        double v[] = {1,2,34.4,554};
        double r[] = Util.reverseArray(v);
        Util.showArray(v);
        Util.showArray(r);
        
    }

}
//23.- Escribe un programa que permita, a partir de un array de 10 elementos numéricos V, generar un array P con
//  los elementos de V en orden inverso. Visualizar los dos arrays al final.