package com.programacionOO.tema13.practica01;

import com.programacionOO.tema07.arrayBidimesional.Practica;

/**
 * 1. Crea un programa que lance un hilo de ejecución (sin esperar a que finalice)
 * que muestre los primeros 100 números enteros.
 * El programa al finalizar debe mostrar “fin de programa”.
 */
public class Practica01 extends Thread{

    @Override
    public void run(){
        super.run();
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
