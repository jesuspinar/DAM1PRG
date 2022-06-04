package com.programacionOO.tema13.practica07;

public class Practica07HiloGestor {

    private final int[] vector;
    private final int x;
    private static int min;
    private static int max;
    private Thread t;
    private boolean listener;

    //todo mostrar el hilo que ha encontrado el numero 
    public Practica07HiloGestor(int[] vector, int x) {
        this.vector = vector;
        this.x = x ;
        listener = repartirArray();
        System.out.println(listener);
        //todo implementar join de todos los hilos involucrados
        //TODO : correct functionality, it wont get any match cause of
        // a new Thread is created during or after a match checking, and
        // that will corrupt integrity of manager checking .isMatch()
        if (listener){System.out.println("Match");}
    }

    /**
     * Reparte el min y el max para cada hilo en funcion a los hijos
     * @return
     */
    private boolean repartirArray() {
        int n_cpu = getHilosDisponibles();
        int num_hilos = vector.length / n_cpu;
        min = 0;
        max = vector.length;

        if(vector.length < num_hilos|| vector.length < 2_000_000){
            Hilo07noSincronizado h = new Hilo07noSincronizado(vector,x,min,max);
            t = new Thread(h);
            t.start();
        }
        else{
            // dividir el hilo
            max = num_hilos;
            // creara tantos hilos como procesadores se dispongan
            // signando un rango de valores para cada hilo nuevo
            Hilo07noSincronizado h;
            for (int i = 0; i < n_cpu ; i++) {
                if (Hilo07noSincronizado.isMatch()){
                    return true;}
                h = new Hilo07noSincronizado(vector,x,min,max);
                t = new Thread(h);
                t.start();
//                if(h.isMatch()){return;}
                min = max;
                max += num_hilos ;
            }
        }
        return false;
    }
    private int getHilosDisponibles(){
        return Runtime.getRuntime().availableProcessors();
    }
}

