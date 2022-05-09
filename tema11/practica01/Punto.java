package com.programacionOO.tema11.practica01;

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
        return  Math.sqrt(Math.pow(this.x - punto.getX(),2) - Math.pow(this.y - punto.getY(),2));
    }
    public double distancia(Punto p1, Punto p2){
        return p1.distancia(p2);
    }

    private double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                "\n";
    }
}
