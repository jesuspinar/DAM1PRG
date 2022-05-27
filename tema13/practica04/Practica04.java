package com.programacionOO.tema13.practica04;

/**
 * 4. Crea un programa que lance un hilo de ejecución en modo demonio (esperando a que finalice)
 * que muestre los primeros 100 números enteros.
 * El programa al finalizar debe mostrar “fin de programa”. ¿Qué ocurre?
 */
public class Practica04 extends Thread {

    @Override
    public void run(){
        super.run();
        if (super.isDaemon()) {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        }
    }
}
