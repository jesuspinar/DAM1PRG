package com.programacionOO.tema07.practica07;

import com.programacionOO.libs.Util;

public class Practica7{
    public static void main(String[] args) {
        String cadena = Util.askString("Introduce la frase a dividir en palabras");
        dividirFrase(cadena);
    }
    public static void dividirFrase(String cadena) {
        String[] frase = cadena.split("\\s");//cuando hay un spacio guarda palabra en poscion array
        for (String palabra : frase){ //recorre cada posicion del array y lo asigna
            System.out.println(palabra);
        }
    }
}
//7. Escribe un programa que lea una frase y muestre cada palabra en una línea diferente.