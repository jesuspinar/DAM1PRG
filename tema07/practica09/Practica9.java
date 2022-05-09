package com.programacionOO.tema07.practica09;

import com.programacionOO.libs.Util;

public class Practica9{
    public static void main(String[] args) {
        String frase = Util.askString("Introduce frase para quitar posicion impar");
        System.out.println(soloCaracterImpar(frase));
        
    }
    public static String soloCaracterImpar(String s){
        String impar = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) {
                impar = impar + s.charAt(i);  
            }
        }
        return impar;
    }
}
// 9. Escribe un método que dada una frase devuelva otra pero 
// con solo los caracteres de las posiciones impares.