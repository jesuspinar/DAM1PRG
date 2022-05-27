package com.programacionOO.tema13.hilos;

import com.programacionOO.tema13.practica01.Practica01;
import com.programacionOO.tema13.practica02.Practica02;
import com.programacionOO.tema13.practica03.Practica03;
import com.programacionOO.tema13.practica04.Practica04;

public class MainT13 {
    public static void main(String[] args) {
//        HiloContador hiloContador = new HiloContador("Contaplus",10);
//        hiloContador.start();//inicia el hilo creado arriba
//        // el main tambien se considera un hilo
//        try {
//            hiloContador.join();
//        } catch (InterruptedException ignored) {
//
//        }
        // .run() ejecuta el metodo sin esperar a la prioridad del admin
        // .start() se une a la cola del admin
//        Practica01 practica01 = new Practica01();
//        practica01.start();

//        Practica02 practica02 = new Practica02();
//        practica02.start();
//        try {
//            practica02.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        Practica03 practica03 = new Practica03();
//        practica03.setDaemon(true);
//        practica03.start();

        Practica04 practica04 = new Practica04();
        practica04.setDaemon(true);
        practica04.start();
        try {
            practica04.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Fin del programa");
    }
}
