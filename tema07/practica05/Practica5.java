package com.programacionOO.tema07.practica05;
import com.programacionOO.libs.Util;
public class Practica5{
    public static void main(String[] args) {
        String frase = Util.askString("Calcular la palabra mas larga de una frase, Introduce una...");
        mayorString(frase);
    }
    public static void mayorString(String s) {
        s = s.replaceAll("\\s+", " ");//elimina spacios de +
        s = s.trim();//asegura eliminar spacios 
        s = s + " ";//forzar mostrar ultima palabra

        String receptor = "";
        String receptorNuevo = "";
        int carateres = 0;
        int lenghtString = s.length();

        for (int i = 0; i < lenghtString; i++) {
            if(s.charAt(i) != ' ') {
                receptorNuevo = receptorNuevo + s.charAt(i);
            }else if(s.charAt(i) == ' '){
                if(receptorNuevo.length() > receptor.length())
                receptor = receptorNuevo;
                receptorNuevo = "";//se borra al imprimir 
            }
        }
        
        carateres = receptor.length();
        System.out.printf("La palabra %s es la mas larga con un total de %d caracteres \n",
        receptor,carateres); 
    }
}
// 5 Escribe un programa que lea una frase y encuentre la palabra de mayor longitud.
// El programa debe imprimir la palabra y el número de caracteres que contiene
