package com.programacionOO.tema13.hilos;

public class HiloContador extends Thread{
    private final int num;
    private final String name;

    public HiloContador(String name,int num){
        this.name = name;
        this.num = num;
    }

    @Override
    public void run(){
        super.run();
        for (int i = 0; i < num; i++) {
            System.out.println("Soy el hilo " + name + " " + i);
        }
    }//cuando el hilo llega aqui muere pero sigue consumiendo r
    // recursos en la variable que lo alberga
}
