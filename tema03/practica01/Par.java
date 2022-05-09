package com.programacionOO.tema03.practica01;

import java.util.Scanner;
public class Par {
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);
        int numero;

        System.out.println("Este program indica si un número es par o impar");
        numero = Integer.parseInt(lector.nextLine());
        lector.close();

        if(numero % 2 == 0 ){
            System.out.println("El número es par");
        }
        else{
            System.out.println("El número es impar");
        }
    }
    
}
