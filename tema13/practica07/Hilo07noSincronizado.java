package com.programacionOO.tema13.practica07;

/*
* 7. Crea una función que permita determinar si un número está
* en un array. No nos interesa su posición, solo saber si se
* encuentra en el array. Para resolver el problema utiliza hilos
* de ejecución de forma que cada hilo observe una parte del array.
* El número de hilos debe ser igual al número de núcleos de tu CPU
* si el tamaño del array lo permite.
*/
class Hilo07noSincronizado implements Runnable {
    //todo implement conversion to treemap
    private int[] vector;
    private int x;
    private int min;
    private int max;
    private static boolean match;

    public Hilo07noSincronizado(int[] vector, int x, int min , int max) {
        this.vector = vector;
        this.x = x;
        this.min = min;
        if (max > vector.length) this.max = vector.length;
        else this.max = max;
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
        if (contains(min,max)){
            match = true;
            System.out.println("Number found");
            //todo: actualizar con interfaz listener onFound(this) onFinised(this)
        }
    }
    //todo no es fiable 100% --
    public static boolean isMatch() {
        return match;
    }
}
