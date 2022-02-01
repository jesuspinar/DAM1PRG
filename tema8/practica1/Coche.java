package com.programacionOO.tema8.practica1;

public class Coche {
    String modelo;
    String matricula;
    Color color;
    boolean metalizada;
    Tipo tipoVehiculo;
    Seguro seguro;

    public  Coche(){
        this.matricula = "3456JKL";
    }

    public Coche(String modelo,String matricula, Color color ,boolean metalizada,Tipo tipoVehiculo,Seguro seguro){
        this.modelo = modelo;
        this.matricula = matricula;
        this.color = color;
        this.metalizada = metalizada;
        this.tipoVehiculo = tipoVehiculo;
        this.seguro = seguro;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public Color getColor() {
        return color;
    }

    public boolean isMetalizada() {
        return metalizada;
    }

    public Tipo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setMetalizada(boolean metalizada) {
        this.metalizada = metalizada;
    }

    public void setTipoVehiculo(Tipo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    public String imprimirCoche() {
        return "Coche " +
                "modelo= '" + modelo + '\'' +
                ", color=" + color +
                ", metalizada=" + metalizada;
    }

}
