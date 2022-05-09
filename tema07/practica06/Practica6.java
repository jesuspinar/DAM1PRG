package com.programacionOO.tema07.practica06;
import java.util.Scanner;

public class Practica6{
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int factor = 0;
        String frase = "";

        System.out.println("Introduce la iteraciones");
        frase = lector.nextLine();
        System.out.println("Introduce la iteraciones");
        factor = Integer.parseInt(lector.nextLine());
        lector.close();
        
        repetirString(frase, factor);
    }
    public static void repetirString(String s, int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(s);
        }
    }
}
// 6 Escribe un programa que lea una frase y un factor de multiplicación y
//  devuelve la frase repetidatantas veces como indique el factor de multiplicación.