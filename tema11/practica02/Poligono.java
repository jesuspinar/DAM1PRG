package com.programacionOO.tema11.practica02;

import com.programacionOO.tema11.practica01.Punto;

import java.util.List;

public class Poligono {
    private List<Punto> puntos;

    public Poligono(List<Punto> puntos) {
        this.puntos = puntos;
    }
    public boolean traslada(double desplazamientoX,double desplazamientoY){
        // Codigo para transladar la cordinada
        return true;
    }
    public int numVertex(){
        //Codigo para devolver el numero de vertices del poligono
        return -1;
    }
    public double perimetro(){
        //Codigo para calcular el perimetro del poligono
        return -1;
    }

    @Override
    public String toString() {
        return "Poligono{\n" +
                "puntos => \n" + puntos +
                '}';
    }
}
