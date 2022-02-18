package com.programacionOO.tema8.Practica06;

import com.github.javafaker.DateAndTime;

public class Bici {
    private long referencia;
    private String marca;
    private String modelo;
    private float peso;
    private float diametroRueda;
    private boolean ebike;
    private DateAndTime fechaFabricacion;
    private double precio;
    private int existencias;

    public Bici(long referencia, String marca, String modelo, float peso, float diametroRueda,
                boolean ebike, DateAndTime fechaFabricacion, double precio, int existencias) {

        this.referencia = referencia;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.diametroRueda = diametroRueda;
        this.ebike = ebike;
        this.fechaFabricacion = fechaFabricacion;
        this.precio = precio;
        this.existencias = existencias;
    }


}
