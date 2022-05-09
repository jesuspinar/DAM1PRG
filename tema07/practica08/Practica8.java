package com.programacionOO.tema07.practica08;

import com.programacionOO.libs.Util;

public class Practica8{
    public static void main(String[] args) {
        String cadena = Util.askString("Introduce la frase a dividir en palabras");
        String[] frase = cadena.split("\\s");
        for (String palabra : frase){
            System.out.printf("%s%8d\n",palabra,palabra.length());
        }
    }
}
//8. Escribe un programa que dada una frase escriba en 2 columnas 
// cada palabra seguida del númerode caracteres que contiene.