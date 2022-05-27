package com.programacionOO.tema12;

public class MainBisiesto {
    public static void main(String[] args) {
        int min_year = 2000;
        int max_year = 2015;

        for (int i = min_year; i < max_year ; i++) {

            System.out.println("Valor " + i + " mod 400 = 0");
            if (i % 400 == 0){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
            //or (
            System.out.println("Valor " + i + " mod 4 = 0 ");
            if ((i % 4 == 0)){
                System.out.println("True");
            }
            else {
                System.out.println("False");
            }
            //and
            System.out.println(i + " mod 100 != 0" );
            if (i % 100 != 0){
                System.out.println("True");
            }else {
                System.out.println("False");
            }
            // )
            System.out.println();
        }

    }
}
