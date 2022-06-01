package com.programacionOO.tema13.practica07;

import static com.programacionOO.tema13.practica07.Hilo07noSincronizado.isMatch;

public class Practica07HiloGestor {

    private final int[] vector;
    private final int x;
    private int min;
    private int max;
    private Thread t;
    private ThreadListener listener;

    public Practica07HiloGestor(int[] vector, int x) {
        this.vector = vector;
        this.x = x ;
         repartirArray();

         // syncronized
//         try{
//             t.join();
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
        //todo implementar join de todos los hilos involucrados
        if (Hilo07noSincronizado.isMatch()) System.out.println("Match");

        // si un array tiene 10 posiciones
        // y tu cpu tiene 4 hilos
        // coje 10 / 4 = 2
        // primer hilo 0-2,
        // segundo hilo 3-5,
        // tercer hilo 6-8,
        // cuarto hijo 9
        // una variable para guardar un indiceDiferencia que se le sumara al
        // parametro max que sera
        // y max anterior se asignara = min

    }

    /**
     * Reparte el min y el max para cada hilo en funcion a los hijos
     */
    private void repartirArray() {
        int n_cpu = getHilosDisponibles();
        int num_hilos = vector.length / n_cpu;
        min = 0;
        max = vector.length;

        if(vector.length < num_hilos){
            Hilo07noSincronizado h = new Hilo07noSincronizado(vector,x,min,max);
            t = new Thread(h);
            t.start();
        }
        else{
            // dividir el hilo
            max = num_hilos;
            // creara tantos hilos como procesadores se dispongan
            // signando un rango de valores para cada hilo nuevo
            for (int i =  0; i < num_hilos ; i++) {
                Hilo07noSincronizado h = new Hilo07noSincronizado(vector,x,min,max);
                t = new Thread(h);
                t.start();
                min = max;
                max += num_hilos ;
            }
        }
    }
    private int getHilosDisponibles(){
        return Runtime.getRuntime().availableProcessors();
    }
}

