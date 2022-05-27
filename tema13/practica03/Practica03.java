package com.programacionOO.tema13.practica03;

/**
 * 3. Crea un programa que lance un hilo de ejecución en modo demonio (sin esperar a que finalice)
 * que muestre los primeros 100 números enteros.
 * El programa al finalizar debe mostrar “fin de programa”. ¿Qué ocurre?
 * Al finalizar el hilo padre automaticamente el hilo demonio desaparece sin importar
 * que se haya terminado su trabajo
 */
public class Practica03 extends Thread {

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
