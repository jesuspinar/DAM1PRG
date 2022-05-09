package com.programacionOO.tema04.practica05;

public class Practica05 {
    public static void main(String[] args) {
        //Localiza pares impares o multiplos de 5 
        final int MAX = 100;
        int acumulado5 = 0, acumuladoImpar = 0, acumuladoPar = 0;
        int total5 = 0, totalImpar = 0, totalPar = 0;
        
        for (int contador = 0; contador < MAX ; contador++) {

            if (contador % 5 == 0){
                //sera multiplo de 5
                System.out.println(contador + " es multiplo de 5");
                acumulado5 = acumulado5 + contador;
                total5++;
            }
            else if (contador % 2 != 0){
                //ser impar
                System.out.println(contador + " es impar");
                acumuladoPar = acumuladoImpar + contador;
                totalImpar++;
            }
            else if (contador % 2 == 0){
                //sera par
                System.out.println(contador + " es par");
                acumulado5 = acumuladoPar + contador;
                totalPar++;
            }
        }
        System.out.println("Tenemos este total de números pares = " + totalPar);
        System.out.println("Tenemos este total de números impares = " + totalImpar);
        System.out.println("Tenemos este total de números multiplos de cinco = " + total5);
    }
}
