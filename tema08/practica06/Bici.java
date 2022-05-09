package com.programacionOO.tema08.practica06;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Bici {
    private long referencia;
    private String marca;
    private String modelo;
    private float peso;
    private float diametroRueda;
    private boolean ebike;
    private Date fechaFabricacion;
    private double precio;
    private int existencias;

    public Bici(long referencia, String marca, String modelo, float peso, float diametroRueda,
                boolean ebike, Date fechaFabricacion, double precio, int existencias) {
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

    public long getReferencia() {
        return referencia;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPeso() {
        return peso;
    }

    public float getDiametroRueda() {
        return diametroRueda;
    }

    public boolean isEbike() {
        return ebike;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getExistencias() {
        return existencias;
    }

    //todo : cambiar setExistencias por venderExitecias
    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    @Override
    public String toString() {
        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
        return  "\nReferencia : " + referencia +
                "\nMarca : " + marca +
                "\nModelo : " + modelo +
                "\nPeso : " + peso + "kg" +
                "\nDiametro Rueda : " + diametroRueda +
                "\nEbike : " + ebike +
                "\nFechaFabricacion : " + fechaFabricacion +
                "\nPrecio : " + precio +
                "\nExistencias : " + existencias +"\n";
    }


}
