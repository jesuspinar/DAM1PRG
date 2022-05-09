package com.programacionOO.tema07.practica02;
public class Practica2{
    public static void main(String[] args) {
        String palabra = "Hola mundo";
        contarVocales(palabra);
    }
    public static void contarVocales(String s) {
        int contadorVocal = 0;
        int contadorConsonante = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                case 'á': case 'é': case 'í': case 'ó': case 'ú':
                case 'à': case 'è': case 'ì': case 'ò': case 'ù':
                    contadorVocal++;
                break;
                default: 
                    if (Character.isLetter(s.charAt(i))) {
                        contadorConsonante++;
                    }
                break;
            }   
        }
        System.out.println(s + " tiene " + contadorVocal + " vocales y "
             + contadorConsonante + " consonantes.");
    }
}