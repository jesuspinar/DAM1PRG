package com.programacionOO.tema04salida.practica02;
import java.util.Scanner;
public class Practica02 {
    public static void main(String[] args) {
        //SET TIME FORMAT
        Scanner lector = new Scanner(System.in);
        int h = 0, m = 0 , s = 0;
        do {
            System.out.println("Introduce la hora en 24H");
            h = Integer.parseInt(lector.nextLine());
        } while (h < 0 || h > 25);
        do {
            System.out.println("Introduce los minutos");
            m = Integer.parseInt(lector.nextLine());
        } while (m < 0 || m > 59);
        do {
            System.out.println("Introduce los segundos");
            s = Integer.parseInt(lector.nextLine());
        } while (s<0 || s > 59);
        
        lector.close();
        //imprime la hora que ha sido introudcida 24H 
        System.out.printf("Hora establecida:\n%02d:%02d:%02d\n",h,m,s);
    }    
}
