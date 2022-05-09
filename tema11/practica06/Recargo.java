package com.programacionOO.tema11.practica06;

public class Recargo {

    private double precioAlquila;
    private double recargo; /**/

    public boolean agregarAlquiler(double precio){
        precioAlquila = precio;
        return true;
    }

    public boolean agregarRecargo(int numDias){
        for (int i = 0; i < numDias; i++) {
            recargo += 2;
        }
        return true;
    }
    public boolean restarRecargo(double cant){
        if (cant <= recargo){
            recargo -= cant;
            return true;
        }
        return false;
    }

    public double getRecargo() {
        return recargo;
    }
}
