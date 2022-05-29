package com.programacionOO.tema13.practica05;

import com.github.javafaker.Faker;

import java.util.HashSet;
import java.util.Locale;

/*
* 5. Crea un programa que cree n hilos de ejecución,
* donde n será un número recibido como parámetro al
* iniciar el programa (args de la función main).
* Cada hilo de ejecución tendrá un identificador único
* asignado en el momento de la creación.
* Al iniciarse cada hilo mostrará los primeros 10000 números
* de la siguiente forma.
* “Hilo: ” + IDENTIFICADOR + “ (“ + numero + “)\n”
* ¿En qué orden se ejecutan los hilos?
*/
public class Practica05 implements Runnable{
    private final int INTERATIONS = 100;
    private String name;
    public Practica05 (String name) {
        this.name = name ;
    }

    @Override
    public void run(){
        for (int i = 0; i < INTERATIONS; i++) {
            System.out.printf("Hilo: " + name +
                    " (" + i + ") \n");
        }
    }

}
