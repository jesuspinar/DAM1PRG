package com.programacionOO.tema08.practica01;

public class Coche {

    public enum Tipo {
        MINI,UTILITARIO,FAMILIAR,DEPORTIVO
    }

    private String modelo;
    private String matricula;//ATRIBUTO MINIMO PARA QUE EL OBJETO EXISTA: Puede ser otro ej(num chasis)
    private Color color;
    private boolean metalizada;
    private Tipo tipoVehiculo;
    private Seguro seguro;

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
        //validaciones aqui...
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

    public void imprimirCoche() {
        System.out.println("Coche " +
                "modelo= '" + modelo + '\'' +
                ", color=" + color +
                ", metalizada=" + metalizada);
    }

    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", color=" + color +
                ", metalizada=" + metalizada +
                ", tipoVehiculo=" + tipoVehiculo +
                ", seguro=" + seguro +
                '}';
    }
}
