package com.programacionOO.tema13.practica07;

/*
* 7. Crea una función que permita determinar si un número está
* en un array. No nos interesa su posición, solo saber si se
* encuentra en el array. Para resolver el problema utiliza hilos
* de ejecución de forma que cada hilo observe una parte del array.
* El número de hilos debe ser igual al número de núcleos de tu CPU
* si el tamaño del array lo permite.
*/
class Practica07 implements Runnable {

    private static final int N_CPU = Runtime.getRuntime().availableProcessors();
//    private Thread thread;
    private int[] vector;
    private int x;
    private boolean match;

    // primer hilo busca de la 1-5
    // segundo hilo busca de la 6-10

    public Practica07(int[] vector, int x) {
        this.vector = vector;
        this.x = x;
        match = false;
    }

    public boolean contains(int min, int max) {
        if (x == min || x == max) return true;
        for(int i = min; i < max; i++) {
            if(vector[i] == x) return true;
        }
        return false;
    }


    @Override
    public void run() {
        // repartirArray()
        // si un array tiene 10 posiciones
        // y tu cpu tiene 4 hilos
        // coje 10 / 4 = 2
        // primer hilo 0-2,
        // segundo hilo 3-5,
        // tercer hilo 6-8,
        // cuarto hijo 9

        int media = vector.length / N_CPU;
        if(vector.length < media){
            match = contains(0,vector.length);
        }else{

            for (int i = 0; i < media; i++) {
//                contains();
            }
        }

        if (match){
            System.out.println("Number found");
        }
    }

    public boolean isMatch() {
        return match;
    }
}
