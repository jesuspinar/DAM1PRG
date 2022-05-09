package com.programacionOO.tema07.practica01;
public class Practica1{
    public static void main(String[] args) {
        String miNombre = "jesus"; 
        System.out.println(mayusPrimera(miNombre));
    }
    public static String mayusPrimera(String s) {
        if (s != null && s.isEmpty()) //controll nullpointer excep
            return null;
        char c = s.charAt(0);
        return s.replace(s.charAt(0),Character.toUpperCase(c));
        //return Character.toUpperCase(palabra.charAt(0) + palabra.substring(1))
    }
}