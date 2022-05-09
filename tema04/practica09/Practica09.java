package com.programacionOO.tema04.practica09;
import java.util.Scanner;

public class Practica09 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero = 0;
        
        System.out.println("Introduce un número para saber si es primo");
        numero = Integer.parseInt(lector.nextLine());
        lector.close();

        //revisa si n es multiplo de 2
        if (numero % 2 == 0){
            System.out.println("El numero " + numero + " no es primo");
        }
        //revisa impares excepturando el 3
        else if (numero != 3 ){
            for(int i = 3; i * i <= numero; i += 2) {
                if(numero % i == 0){
                    System.out.println("El numero " + numero + " no es primo");
                }
            }
            System.out.println("El numero " + numero + " es primo");
        }
        else{
            System.out.println("El numero " + numero + " es primo");
        }
        /* FORMA LENTA
        int contador = 2;
            //RAIZ CUADRADA DE NUMERO PUEDE AGILIZAR ESTO
            //REVISAR PRIMERO SI ES PAR
            while(contador < (numero - 1)){
                if (numero % contador == 0){
                    break;
                }
                contador++;
            }
            if(contable == numero ){
                System.out.println("Es primo ");
            }
            else {
                System.out.println("No es primo")
            }
            */

            /* */
        
    }
}

