package com.programacionOO.tema07.practica04;

import com.programacionOO.libs.Util;

public class Practica4{
    public static void main(String[] args) {
        String frase = Util.askString("Escribe una frase o palabra para analizar");
        analizarString(frase);
    }

    public static int contarVocal(String s) {
        int contadorVocal = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                case 'á': case 'é': case 'í': case 'ó': case 'ú':
                case 'à': case 'è': case 'ì': case 'ò': case 'ù':
                    contadorVocal++;
                break;
            }   
        }
        return contadorVocal;
    }
    public static int contarConsonante(String s) {
        int contadorConsonante = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'b': case 'c': case 'd': case 'f': case 'g':
                case 'h': case 'j': case 'k': case 'l': case 'm':
                case 'n': case 'ñ': case 'p': case 'q': case 'r':
                case 's': case 't': case 'v': case 'w': case 'x':
                case 'y': case 'z': 
                    contadorConsonante++;
                break;
            }
        }
        return contadorConsonante;
    }
    public static int contarPalabra(String s) {
        int contadorPalabra = 1;
        String space = s.replaceAll("\\s+", " ");//replaza dobles spacios
        s = space.trim();//quita spacios finales
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case ' ':
                    contadorPalabra++;
                break;
            }   
        }
        return contadorPalabra;
    }
    
    public static void analizarString(String s) {
        s = s.replaceAll("\\s+", " ");//elimina spacios de +
        s = s.trim();//asegura eliminar spacios 
        s = s + " ";//forzar mostrar ultima palabra

        String receptor = "";
        int lenghtString = s.length();
        // StringBuilder palabra = new StringBuilder();

        for (int i = 0; i < lenghtString; i++) {
            if(s.charAt(i) != ' ') {
                // palabra = palabra.append(s.charAt(i)); 
                receptor = receptor + s.charAt(i);
            }else if(s.charAt(i) == ' ' || s.length() == i){
                System.out.printf("La palabra %s tiene %d vocales y %d consonantes \n",
                receptor,contarVocal(receptor),contarConsonante(receptor));
                receptor = "";//se borra al imprimir 
            }
        }
    }
}