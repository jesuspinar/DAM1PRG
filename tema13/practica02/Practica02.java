package com.programacionOO.tema13.practica02;

/**
 * 2. Crea un programa que lance un hilo de ejecución (esperando a que finalice)
 * que muestre los primeros 100 números enteros.
 * El programa al finalizar debe mostrar “fin de programa”.
 */
public class Practica02 extends Thread{

    @Override
    public void run(){
        super.run();
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}