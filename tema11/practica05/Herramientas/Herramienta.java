package com.programacionOO.tema11.practica05.Herramientas;

import com.programacionOO.tema11.practica05.Materiales.Material;

public abstract class Herramienta {
    private final int ATAQUE_DEFAULT = 1;
//    private final Stack CAPACIDAD_MAX = Stack.UNIT;

//    private Stack capacidad;

    private final int ataque;
    private final int vida;
    private final String nombre;
    private final Material material;
    private int cantidad;

    public Herramienta(Material tipo){
//        capacidad = CAPACIDAD_MAX;
        cantidad = 1;
        ataque = ATAQUE_DEFAULT;
        this.vida = tipo.getResistencia();
        this.nombre = tipo.getNombre();
        material = tipo;

    }
    public Herramienta(Material tipo, int ataque){
//        capacidad = CAPACIDAD_MAX;
        this.ataque = ataque;
        this.vida = tipo.getResistencia();
        this.nombre = tipo.getNombre();
        material = tipo;
    }

//    public Stack getCapacidad() {
//        return capacidad;
//    }

    @Override
    public String toString() {
        return  "\nnombre = " + nombre  +
                ", ataque = " + ataque +
                ", vida = " + vida +
                ", cantidad (" + cantidad +
                ')';
    }
}
