package com.programacionOO.tema04.aleatorio;

import java.util.Random;
public class Aleatorio {
    public static void main(String[] args ){
        //Genera e imprime numero aletorio
        Random r = new Random(); 
        int x = r.nextInt();
        System.out.println(x);
    }
    
}
