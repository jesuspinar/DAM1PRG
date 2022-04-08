package com.programacionOO.tema11.Practica01;

public class Punto {
    private double x;
    private double y;

    public Punto() {this(10,10);
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distancia(Punto punto){
        //codigo para calcular distancia
        return 0;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                "\n";
    }
}
