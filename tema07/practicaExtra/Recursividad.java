package com.programacionOO.tema07.practicaExtra;
public class Recursividad {
    // RECURSIVIDAD
    public static void main(String[] args) {
        saludo("Juan", 1);
    }

    public static void saludo(String s, int n) {
        System.out.println("Hola "+s + "nivel de recursividad" + n);
        saludo(s, n+1);
    }
    public static long factorial(long n) {
        if (n == 0)
            return 1;
        return n * factorial(n-1);  
    }
}