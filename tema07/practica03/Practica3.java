package com.programacionOO.tema07.practica03;
public class Practica3{
    public static void main(String[] args) {
        String palabra = "Hola mundo";
        contarPalabras(palabra);
    }
    public static int contarPalabras(String s) {
        int contador = 1;
        String space = s.replaceAll("\\s+", " ");
        s = space.trim();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case ' ':
                    contador++;
                break;
            }   
        }
        System.out.println(s + " tiene " + contador + " palabras");
        return contador;
    }
}