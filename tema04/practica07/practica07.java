package com.programacionOO.tema04.practica07;

import java.util.Scanner;

public class practica07 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double numero = 0 ;
        // double numeroFijo = 0;
        int elevado = 0 ;

        double resultado = 1;
        boolean potenciaNegativa = false;

        System.out.println("Escribe un numero ");
        numero = Double.parseDouble(lector.nextLine());
        System.out.println("Escribe un a que lo elevas ");
        elevado = Integer.parseInt(lector.nextLine());
        lector.close();

        if (elevado < 0 ) {
            potenciaNegativa = true;
            elevado = elevado * (-1);
        } 
        for (int i = 1; i<= elevado; i++) {
            resultado= resultado * numero;
        }
        if (potenciaNegativa) {
            resultado = 1/resultado;
        }
        System.out.println("El resultado de la potencia es " + resultado);
            
        
        // //guarda valor para calculo 
        // numeroFijo = numero;

        // //aqui elevados positivos y/o numeros +/-
        // if(elevado > 0) {
        //     while (elevado > 1 ){
        //         numero = numeroFijo * numero;
        //         elevado --;
        //     }
        //     System.out.println("El resultado de la potencia es " + numero);
        // }
        // //aqui elevado igual 0 
        // else if(elevado == 0){
        //     System.out.println(numeroFijo);
        // }
        // //aqui elevados negativos y numeros negativos
        // else if (elevado < 0 && numero < 0){

        //     while (elevado > -1 ){
        //         numero = numeroFijo * numero;
        //         elevado ++;
        //     }
        //     System.out.println("El resultado de la potencia es " + numero);
        // }
        // //aqui elevados negativos 
        // else{
        //     while (elevado > -1 ){
        //         numero = numeroFijo * numero;
        //         elevado --;
        //     }
        //     System.out.println("El resultado de la potencia es " + numero);
        // }
    }
}
