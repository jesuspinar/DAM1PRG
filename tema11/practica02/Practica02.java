package com.programacionOO.tema11.practica02;

import com.programacionOO.tema11.practica01.Punto;

import java.util.ArrayList;
import java.util.List;

public class Practica02{

    private List<Punto> puntos;
    private Poligono poligono;

    public Practica02(int init) {
        puntos = new ArrayList<>(init);
        poligono = new Poligono(puntos);
        crearPuntos();
        System.out.println(poligono.toString());
        System.out.println(poligono.perimetro());
        System.out.println(poligono.traslada(12, 32.4));
        System.out.println(poligono.toString());
    }

    private boolean crearPuntos(){

        Punto p1 = new Punto(0,0);
        Punto p2 = new Punto(2,0);
        Punto p3 = new Punto(2,2);
        Punto p4 = new Punto(0,2);

        puntos.add(p1);puntos.add(p2);puntos.add(p3);puntos.add(p4);
        return true;
    }
}

//todo :
// - Cree un Polígono de cuatro vértices,que serán(0,0),(2,0),(2,2),(0,2).
// - Muestre la información del polígono y su perímetro.
// - Traslade el polígono 4 unidades en el eje x y -3 en el eje y.
// - Vuelva a mostrar la información del polígono por pantalla