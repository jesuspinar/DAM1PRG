package com.programacionOO.tema06.practica02;

import java.util.Scanner;

import com.programacionOO.libs.Util;
import com.programacionOO.libs.Ansi;

public class Practica02 {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        double radio ;

        Ansi.clearScreen();
        System.out.println("Calculo del area y la longitud de Circunferencia");
        System.out.println("Introduce el radio");
        radio = Double.parseDouble(lector.nextLine());
        lector.close();
        
        System.out.printf("El area del circulo es = %.2f \n", areaCirculo(radio));  
        System.out.printf("La longitud del circulo es = %.2f \n", longitudCirculo(radio));

    }
    public static double areaCirculo(double radio){
        return radio = Math.pow(radio, 2) * Math.PI ;//pow eleva (base, exponente)
    }
    public static double longitudCirculo(double radio){
        return radio = 2 * Math.PI * radio;
    }
}
